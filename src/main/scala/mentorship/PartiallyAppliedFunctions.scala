package mentorship

class PartiallyAppliedFunctions {

  def shortest(s1: String, s2: String): String = if (s1.length < s2.length) s1 else s2

  def maximumValue(i1: Int, i2: Int): Int = if (i1 > i2) i1 else i2

}

object PartiallyAppliedFunctions extends PartiallyAppliedFunctions {

  def main(args: Array[String]) = {
    val evaluateShortest = shortest _
    println(evaluateShortest("this", "the"))

    val evaluateMaximumValue = maximumValue _
    println(evaluateMaximumValue(5, 10))
  }

}
