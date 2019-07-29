package mentorship

class TypeHierarchy extends Types {

  override def addTwoNumbers(i1: Int, i2: Int): Int = super.addTwoNumbers(i1, i2)

  def addAndMultiply(i1: Int, i2: Int, i3: Int) = super.addTwoNumbers(i2, i2) * i3

  addAndMultiply(2, 3, 5)
}

object TypeHierarchy extends TypeHierarchy {

  def main(args: Array[String]) = {

  }

}