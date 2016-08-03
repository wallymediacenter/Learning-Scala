import scala.math.random
import scala.collection.mutable.ArrayBuffer

object Test{
  def main(args:Array[String]) : Unit = {

    def randomArr(n : Int) = {
      var arr = new ArrayBuffer[Double]()
      for(i <- 0 until n) {
        arr += random
      }
      arr.toArray
    }
    println(randomArr(10).mkString(" | "))

    val arr =Array[Int](1, 2, 3, 4, 5, 6, 7)
    var temp : Int = 0
    for(i <- 0 until (arr.length-1, 2) ){
      temp = arr(i)
      arr(i) = arr(i+1)
      arr(i+1) = temp
    }
    println(arr.mkString(" | "))

    var arr2 = for(i <- 0 until arr.length) yield{
      if(i == arr.length -1 && arr.length % 2 == 1) arr(i) else if(i%2==0)arr(i+1) else arr(i-1)
    }
    println(arr2.mkString(" | "))

    val arr3 = Array[Int](1, 2, 3, -3, -4, -5, 1, 2, 0, 0)

    var arr4 = for(i <- arr3 if(i > 0) ) yield i
    var tempArray = for(i <- arr3 if(i == 0) ) yield i
    arr4 = arr4 ++ tempArray
    tempArray = for(i <- arr3 if(i<0)) yield i
    arr4 = arr4 ++ tempArray

    println(arr4.mkString(" | "))
  }
}
