object Test{
  def main(args : Array[String]) : Unit = {
    val newClass = new MyClass()
    println(newClass.name) //Getter
    newClass.name_=("New Name") //Setter
    println(newClass.name)
  }

}

//CLass
class MyClass{
  //Fields | MUST INITIALIZE the fields
  var name : String = "Null"
  var value : Int = 0
  private[this] var secret = "MESSAGE" ////Object-private only accessible through that specific object. NO getter and setter
  //methods are public by default
  //getter . || setter _=()

  //Auxiliary constructor


}
