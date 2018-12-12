package objectOriented

object OOBasics extends App{
  
  val person = new Person("John", 26)
  println(person.x)
  println(person.greet("vivek"))
  println(person.greet())
  
}

//constructor
class Person(name:String, age:Int) {

//class parameters and class fields are two different things
//to convert a class parameter to field is by adding val
val x= 10
def greet(name: String): Unit = println(s"${this.name} says hi $name")

//overloading -- methods with same name but different signatures

//different signature means different number of parameters, of different types or  different names coupled with different return types
  def greet(): Unit = println(s"Hi , I am $name")
  
//multiple constructors
  def this(name:String) = this(name,0)
}