package mentorship

class countValue {

  var counter = 0

  val minValue = 10

  def incrementCounter(i: Int): Unit = {
    counter = minValue + i
    println(counter)
  }
}

object countValue extends App {

  val count = new countValue
  count.incrementCounter(5)

}
