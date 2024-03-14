package u02.exercises

object Task2a extends App:
  val f: Int => String = _ match
    case n if n >= 0 => "positive"
    case _           => "negative"

  def fMethod(x: Int): String = x match
    case x if x >= 0 => "positive"
    case _           => "negative"

  val neg: (String => Boolean) => String => Boolean = x => !x(_)
  def negMethod(x: String => Boolean): String => Boolean = !x(_)
