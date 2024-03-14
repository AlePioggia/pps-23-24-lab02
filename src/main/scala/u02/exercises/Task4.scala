package u02.exercises

object Task4 extends App:
  enum Shape:
    case Rectangle(base: Double, height: Double)
    case Square(base: Double)
    case Circle(radius: Double)

  object ShapeUtils {
    def perimeter(shape: Shape): Double = shape match
      case Shape.Rectangle(base, height) => base * 2 + height * 2
      case Shape.Square(base)            => base * 4
      case Shape.Circle(radius)          => radius * Math.PI * 2
  }
