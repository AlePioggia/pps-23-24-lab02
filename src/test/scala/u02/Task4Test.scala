package u02
import org.junit.*
import org.junit.Assert.*
import u02.exercises.Task4.*;
import u02.exercises.Task4.Shape.*;
import u02.exercises.Task4.ShapeUtils.*

class Task4Test {

  @Test def testPerimeter(): Unit = {
    assertEquals(perimeter(Rectangle(2, 4)), 12, 0)
    assertEquals(perimeter(Square(4)), 16, 0)
    assertEquals(perimeter(Circle(4)), 25, 1)
  }
}
