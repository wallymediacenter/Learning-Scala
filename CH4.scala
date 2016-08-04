object CH4{
  def main(args:Array[String]) : Unit = {
    //Construct a mutable Map
    val scores = scala.collection.mutable.Map("Allice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    //Acessing value
    println(scores("Bob"))
    println()
    //EMPTY map || NEED TO specify the datatype
    val score2 = new scala.collection.mutable.HashMap[String, Int]

    //score iterative
    for((k,v) <- scores) println(k + " -> " + v)

    println(scores.keySet) //Access only keys
    println(scores.values) //Access only values

    //Tuples
    val firstTuples = (1, 1.5, "Tuples")

    println("Tuples start with 1, firstTuples._1 : " + firstTuples._1)

    //Pattern matching || first = 1, second = 1.5, third = "Tuples"
    val (first, second, third) = firstTuples
    println(third)


  }
}
