package u02
import org.junit.*
import org.junit.Assert.*
import u02.exercises.Task4.*;
import u02.exercises.Task4.Shape.*;
import u02.exercises.Task4.ShapeUtils.*

class Task4Test {

  @Test def testPerimeter(): Unit = {
    assertEquals(perimeter(Square(4)), 16, 0)
    assertEquals(perimeter(Rectangle(2, 4)), 12, 0)
    assertEquals(perimeter(Circle(4)), 25, 1)
  }

  @Test def testContainsWithBoundedPoints(): Unit = {
    assertTrue(contains(Square(4), (2, 2)))
    assertTrue(contains(Rectangle(4, 5), (3, 3)))
    assertTrue(contains(Circle(4), (2, 2)))
  }

  @Test def testContainsWithUnboundedPoints(): Unit = {
    assertFalse(contains(Square(4), (4, 5)))
    assertFalse(contains(Rectangle(4, 5), (5, 6)))
    assertFalse(contains(Circle(4), (6, 6)))
  }
}
