package u02.`lab-exercises`

object Task2b extends App:
  val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z
  def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z
  def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y == z

def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
//Constraint -> f needs the correct input, so g should return the same type as f input
def generalCompose[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))
