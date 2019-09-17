package mentorship

object HigherOrderFunctions {

  def math(x: Double, y: Double, f:(Double, Double) => Double): Double = f(x,y)

  def subtract(x: Double, y: Double, z: Double, f:(Double, Double) => Double): Double = f(x,y) - z

  def main(args: Array[String]) = {
    val addition = math(20, 30, (x,y)=> x+y)
    println(addition)

    val sub = subtract(x = 20, y = 10, f = (a, b)=> a+b, z = 10)
    println(sub)

  }

}
