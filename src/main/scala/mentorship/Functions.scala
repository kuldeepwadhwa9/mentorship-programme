package mentorship

class Functions {

  val calculateTotal: (Int, Int) => Int = (i1: Int, i2: Int) => i1 + i2

  def calculate(i1: Int, i2: Int) = {
    val result = i1 + i2
    println(result)
  }

  def doThis(x: String => Unit) = {
    x("Hello")
  }

  def sumNumbers(x: Int, y: Int) = {
    x + y
  }
}

object Functions extends Functions {

  def main(args: Array[String]) = {
    calculate(1, 2)

    println(calculateTotal(100, 200))

    doThis(println)

    println(sumNumbers(4, 5))


  }
}
