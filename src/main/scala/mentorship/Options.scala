package mentorship

class Options {

  def division(num: Int, den: Int): Option[Double] = {
    if (den == 0) None else Some(num / den)
  }

  division(21, 7).getOrElse("den can't be zero")

}

object Options extends Options {
  def main(args: Array[String]): Unit = {
  }
}