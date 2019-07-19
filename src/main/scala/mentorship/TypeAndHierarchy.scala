package mentorship

class TypeAndHierarchy {

  val favouriteFruit: Any = "Watermelon"
  println("My favourite fruit is " + favouriteFruit)

  val favoriteChocolate: AnyRef = "Dairy milk"
  println(s"My favourite chocolate is $favoriteChocolate")

}

object TypeAndHierarchy extends TypeAndHierarchy {

  def main(args: Array[String]) = {

  }

}



