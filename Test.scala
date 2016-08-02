import scala.math._ /*_ is the wildcard similar to * in java*/

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

    //Mathematical function
    println("sqrt(2) =" + sqrt(2));

    // Static method in java is similar to singleton object, and companion object

    //Scala method can be created without () (a.k.a parentheses). METHOD that doesn't modify the object has no ()

    //String
    println("String as array" + "number4"(4)); //this is equivalent to "number4".charAt(4)

    //The use if BigInt

    val twoPow = BigInt(2);
    println("2^1024 = " + twoPow.pow(1024));

    //Class Unit that have one value (), Unit ~ void in java. () is a place holder for "no useful value"

    val example = 10 + //
    11
    println("10 + 11 = " + example); //Use // to connect the next line

    //{Block} contains a sequence of expression, and the result is also an expression
    val distance = {
      val dx = 10;
      val dy = 20;
      sqrt(dx*dx + dy*dy); //Value of distance is the last expression
    }

    println("Distance " + distance);

    //For loop
    for(i <- 1 to 10) println("Loop #:" + i);

    val s = "Traverse";
    for(i <- 0 until s.length) println("Letter Counting: " + s(i));
  }
}
