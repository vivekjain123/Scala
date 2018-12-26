package objectOriented

object MethodNotations extends App {
  class Person(val name:String, favouriteMovie:String,val age:Int=0){
    
    def likes(movie:String):Boolean = movie == favouriteMovie
    def +(person:Person):String =s"${this.name} hangsout with ${person.name}"
    def unary_! : String = s"${name} printing from unary method"
    def isAlive: Boolean = true
    def apply(): String = s"Hello my name is $name and I like $favouriteMovie"
    //look at the Exercise details below in comments
    def +(nickName : String) : Person = new Person(s"$name ($nickName)",favouriteMovie)
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def learn(thing: String):String = s"$name is learning $thing"
    def learnsScala : String = s"$name learns scala"
    def apply(n:Int): String = s"$name watched $favouriteMovie $n times"
  }
  val leo = new Person("Leonardo","Dark Knight")
  println(leo.likes("Dark Knight"))
  println(leo likes "Dark Knight") // equivalent to above
  val tom = new Person("tom hanks","Forest Gump")
  println(tom.+(leo))
  println(tom + leo )
  //Infix notation = operator notation
  //only works with methods with one parameters.
  //All operators are methods in scala
  
  
  //Prefix notation
  
  val x= -1
  val y = 1.unary_-
  
  //unary prefix only works with + - ~ !
  
  println(!leo)
  println(leo.unary_!)
  
  // postfix notation
  //functions that dont have parameter can be used as postfix operator.
  
  println(leo.isAlive)
  
  //apply
  
  println(leo.apply())
  // when class has apply function then object can be called as a function
  println(leo())
  
  /*Exercises
    1. Overload the + operator
   leo + "the rockstar " => new person "leo (the rockstar)"
    2.  Add an age to the Person class
        Add a unary + operator => new person with the age + 1
        +mary => mary with the age incrementer
    3.  Add a "learns" method in the Person class => "leo learns Scala"
        Add a learnsScala method, calls learns method with "Scala".
        Use it in postfix notation.
    4.  Overload the apply method
        mary.apply(2) => "Mary watched Inception 2 times"
   */
  
  println((leo + "Tommy").apply())
  println((+leo).age)
  println(leo.learn("scala"))
  println(leo learnsScala)
  println(leo(4))
  
}