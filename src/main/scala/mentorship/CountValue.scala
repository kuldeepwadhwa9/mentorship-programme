package mentorship

class CountValue {

  val minValue = 10

  def incrementCounter(i: Int): Unit = {
    val counter = minValue + i
    println(counter)
  }
}

object CountValue {

  def main(args: Array[String]) = {
    val count = new CountValue
    count.incrementCounter(5)
  }

}
