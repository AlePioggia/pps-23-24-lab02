package u02.exercises
import task5.Optionals.Optional.Empty;
import task5.Optionals.Optional.Maybe;
import task5.Optionals.Optional;

object CompleteExercise extends App:

  // Task 2a
  val f: Int => String = _ match
    case n if n >= 0 => "positive"
    case _           => "negative"

  def fMethod(x: Int): String = x match
    case x if x >= 0 => "positive"
    case _           => "negative"

  val neg: (String => Boolean) => String => Boolean = x => !x(_)
  def negMethod(x: String => Boolean): String => Boolean = !x(_)

  // Task 2b

  val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z
  def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z
  def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y == z

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
  def generalCompose[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))

  // Task 3

  @annotation.tailrec
  def gdc(a: Int, b: Int): Int = b match
    case 0 if b == 0 => a
    case _           => gdc(b, a % b)

  // Task 4

  enum Shape:
    case Square(base: Double)
    case Rectangle(base: Double, height: Double)
    case Circle(radius: Double)

  object ShapeUtils:
    def perimeter(shape: Shape): Double = shape match
      case Shape.Square(base)            => base * 4
      case Shape.Rectangle(base, height) => base * 2 + height * 2
      case Shape.Circle(radius)          => radius * Math.PI * 2

    def contains(shape: Shape, point: (Double, Double)) = (shape, point) match
      case (Shape.Square(base), (x, y)) => Math.sqrt(x * x + y * y) < base
      case (Shape.Rectangle(base, height), (x, y)) =>
        x >= 0 && x <= base && y >= 0 && y <= height
      case (Shape.Circle(radius), (x, y)) =>
        x >= 0 && x <= radius && y >= 0 && y <= radius

    // Task 5

    def map[A, B](optional: Optional[A], f: A => B): Optional[B] =
      optional match
        case Maybe(value) => Maybe(f(value))
        case Empty()      => Empty()

    def fold[A, B](optional: Optional[A])(default: B)(f: A => B): B =
      optional match
        case Maybe(value) => f(value)
        case _            => default
