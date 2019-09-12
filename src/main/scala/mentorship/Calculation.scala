package mentorship

trait Calculation {

  def num: Int

  def /(n: Int) = n match {
    case n if n != 0 => num / n
    case _ => throw new Exception("Denominator can not be 0")
  }

  def *(n: Int) = {
    val result = num * n
    println(result)
  }

  def -(n: Int) = {
    val result = num - n
    println(result)
  }

  def +(n: Int) = {
    val result = num + n
    println(result)
  }
}
