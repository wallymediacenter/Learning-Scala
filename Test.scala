import scala.collection.mutable.ArrayBuffer

object Test{
  def main(args:Array[String]) : Unit = {
    //1.
    def signum(x : Double) = if(x >= 0) 1 else -1

    //4/
    for(i <- 10 to 1 by -1) print(i)
    println()
    //OR
    for(i <- (1 to 10).reverse) print(i)
    println()

    def countdown(n:Int) : Unit = {
      for(i <- n to 0 by -1) print(i + " ")
      println()
    }
    countdown(20)

    var x = 1;
    for(c <- "Hello") x*=c.toInt
    println(x)

    //8
    def product(s : String) = s.foldLeft(1)(_*_.toInt)
    println(product("Hello"))

    //Array for Scala
    val nums = new Array[Int](10) //Fixed-length array of length 10 and type INT

    //ArrayBuffer that grows and strink on demand
    val arr = new ArrayBuffer[Int]() //Create an empty array

    arr += 1 //Add to the end 1 as an new element of the array

    arr ++= Array(1,2,3,4) //Add a collection

    arr.insert(2, 3) // Insert 3 at the index 2

    println(arr.toArray.mkString(" - "))

    //NOTE 0 to 3. (3) is inclusive  On the other hand 0 until 3, (3) is not inclusive

    val a = 0 to 10
    for( i <- 0 until (a.length, 2) ) print(i) //Increments my 2
    println()

    //Transofrming array
    val b = for(element <- a) yield 10*element
    println(b.mkString(" - "))

    val a2 = Array(1, 2, 3, 4, -10, 11, 12, 13)
    val negIndex = for(i <- 0 until a2.length if a2(i) < 0) yield i
    println("Index " +negIndex.mkString + " Value " + a2(negIndex(0)))

    
  }
}
