package u02.exercises

object Task4 extends App:
  enum Shape:
    case Square(base: Double)
    case Rectangle(base: Double, height: Double)
    case Circle(radius: Double)

  object ShapeUtils {
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

  }
