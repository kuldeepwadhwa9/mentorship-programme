package mentorship

case class Calculator(num: Int) {

  def divide: PartialFunction[Int, Any] = compute orElse exception

  def add(n: Int): Int = {
    num + n
  }

  def multiply(n: Int): Int = {
    num * n
  }

  def subtraction(n: Int): Int = {
    num - n
  }

  private def exception: PartialFunction[Int, String] = {
    case d => s"'$d' denominator can not be zero"
  }

  private def compute: PartialFunction[Int, Int] = {
    case d if d != 0 => num / d
  }
}

object Calculator extends App {

  println(Calculator(24).divide(0))

}

