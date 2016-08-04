object CH4HW{
  def main(args : Array[String]) : Unit = {

    //1
    var priceMaps = Map[String, Double]("Pen" -> 10.0, "Pencil" -> 8.0, "Eraser" -> 10.0)

    var priceMapDiscount = for((k, v) <- priceMaps) yield (k, v*0.9)
    println(priceMapDiscount)

    //2.
    var wordCount = new scala.collection.mutable.HashMap[String, Int]

    val in = new java.util.Scanner(new java.io.File("text.txt"))
    while(in.hasNext()){
      val s = in.next()
      wordCount(s) = wordCount.getOrElse(s, 0) + 1
    }
    println(wordCount)

    //3. immutable map
    var wordCount2 = Map[String, Int]()
    val in2 = new java.util.Scanner(new java.io.File("text.txt"))
    while(in2.hasNext()){
      val s = in2.next();
      wordCount2 = wordCount2 + (s -> (wordCount2.getOrElse(s, 0) + 1))
    }
    println(wordCount2)

    var wordCount3 = scala.collection.SortedMap[String, Int]()
    val in3 = new java.util.Scanner(new java.io.File("text.txt"))
    while(in3.hasNext()){
      val s = in3.next();
      wordCount3 = wordCount3 + (s -> (wordCount3.getOrElse(s, 0) + 1))
    }
    println(wordCount2)

    var weekdays = scala.collection.mutable.LinkedHashMap[String, Int]("MONDAY" -> java.util.Calendar.MONDAY, "TUESDAY" -> java.util.Calendar.TUESDAY, "WEDNESDAY" -> java.util.Calendar.WEDNESDAY, "THURSDAY" -> java.util.Calendar.THURSDAY, "FRIDAY" -> java.util.Calendar.MONDAY, "SATURDAY" -> java.util.Calendar.SATURDAY, "SUNDAY" -> java.util.Calendar.SUNDAY)

    for(i <- weekdays) println(i)

    val testArray = Array(1,3,4,5,5,6,6,2,2)
    println(minmax(testArray).mkString(" | "))
  }

  def minmax(values: Array[Int]) = {
    var min = values(0)
    var max = values(0)
    for(i <- values){
      if(i < min) min = i else if(i > max) max = i
    }
    Array(min, max)
  }
}
