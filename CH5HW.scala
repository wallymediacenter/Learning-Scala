object CH5HW{
  def main(args:Array[String]) : Unit = {
    /* 1.
    Improve the Counter class in Section 5.1, “Simple Classes and Parameterless Methods,” on page 51 so that it doesn’t turn negative at Int.MaxValue.
    */
    val counter = new Counter
    counter.increment
    println(counter.current.toString)

    val bank = new BankAccount
    bank.deposite(1000)
    bank.withdraw(1500)
    bank.withdraw(500)

    val a = new Time(10, 0)
    val b = new Time(9, 20)
    println(a.before(b))

    val per = new Person("Tu Nguyen")
    println(per.first)
    println(per.last)


  }
}

class Counter{
  private var value  = BigInt("0") //When Int reached MaxValue increment will cause it to be negatie
  def increment : Unit =  {
    value += 1
  }
  def current = value
}

class BankAccount{
  private var balance = 0;
  def getBalance = balance; //Read only
  def deposite(value:Int) : Unit = balance+=value
  def withdraw(value:Int) : Unit = {
    if(value > balance) println("Fund insufficient")
    else{
      balance -= value
      println("$" + value + " withdrawed")
    }
  }
}

class Time(private val hours:Int, private val minutes:Int){
  val time = hours*60 + minutes
  def before(other : Time) : Boolean = time < other.time
}

class Person(private val fullName : String){
  private val name = fullName.split(" ")
  val first = name(0)
  val last = name(1)
}

class Car(val manufacturer : String, val modelName : String){
  private var modelYear : Int = -1
  var liscensePlate : String = ""

  def this(newManufacturer:String, newModelName : String, newModelYear:Int, newLiscensePlate:String){
    this(newManufacturer, newModelName)
    modelYear = newModelYear
    liscensePlate = newLiscensePlate
  }

  def getModelYear = modelYear

}
