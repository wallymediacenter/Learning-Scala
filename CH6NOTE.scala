object CH6NOTE{
  def main(args : Array[String]) : Unit = {
    val newClass = new MyClass("Awesome", 100)
    println(newClass.name) //Getter
    newClass.name_=("New Name") //Setter
    println(newClass.name)

    val newClass2 = new MyClass("A little bit Awesome")
    println(newClass2.name) //Getter
    println(newClass2.value) //Getter
  }

}

//CLass
//PRIMARY constructor is written wth class defnition
class MyClass(var name: String, var value : Int){
  //Fields | MUST INITIALIZE the fields

  private[this] var secret = "MESSAGE" ////Object-private only accessible through that specific object. NO getter and setter
  //THE PRIMARY construcor executes all statements in the class deffinition
  //methods are public by default
  //getter . || setter _=()

  //Auxiliary constructor || Similar to constructor in Java, must start with a call to a previously definex ausliary constructor or the primary constructor
  def this(newName : String) {
    this(newName, 0) //MUST HAVE
    this.name = newName
  }
}
