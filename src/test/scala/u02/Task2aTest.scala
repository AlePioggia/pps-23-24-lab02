package u02
import org.junit.*
import org.junit.Assert.*

class Task2aTest {
  val neg: (String => Boolean) => String => Boolean = x => !x(_)

  @Test def testNeg(): Unit = {
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
  }
}
