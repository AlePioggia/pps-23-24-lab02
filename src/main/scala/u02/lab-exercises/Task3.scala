package u02.`lab-exercises`

object Task3 extends App:

  // second argument is always greater than first
  @annotation.tailrec
  def gdc(a: Int, b: Int): Int = b match
    case 0 if b == 0 => a
    case _           => gdc(b, a % b)
