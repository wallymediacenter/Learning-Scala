import scala.math._ //_ is the wildcard similar to * in java

object Test {
  def main(args : Array[String]) = {
    println("Hello World");

    //CREATING BIG INTEGER > 16 digits
    val bigInteger = BigInt("156548184697878154891881845448458484");
    println("Big Integer:\n" + bigInteger);

    //Similarly BIG Decimal
    val pi  = BigDecimal("3.14159265358979323846264338327950288419716939937510");
    println("Big Decinal Pi:\n" + pi);

    //ENCOURAGE to use val(a fixed value) instead of var.
    //var sould only be used if the variable really need to change the content

    //USE methods to convert between numeric types
    val testInt:Double = 10.99;
    println("Convert Double to Integer " + testInt.toInt);


  }
}
