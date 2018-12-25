package objectOriented

object OOBasics extends App{
  
  val person = new Person("John", 26)
  println(person.x)
  println(person.greet("vivek"))
  println(person.greet())
 val aa = new Writer("Gregory David", "Roberts", 1952)
  println(aa.yearOfBirth)
  println(aa.fullName)
  
  val nn = new Novel("shantaram",2003,aa)
  println(nn.authorAge)
  println(nn.isWrittenBy(aa))
  
  val cc = new Counter
  cc.inc.print
  
  
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

/* Create novel and writer class. Write class should have three params
 * first name , surname and year of birth.
 *  A method called fullname which return concatenation of firstname and surname
 *  Novel :name, year of release, author
 *  authorage : age of author at year of release
 *  isWrittenBy: author
 *  copy(new year of release) : new instance of novel with new year of release i.e revised year of release
 */
 
class Writer(firstName :String, surname:String, val yearOfBirth:Int){
  def fullName= firstName+" "+surname
  
}

class Novel(name :String, yearOfRelease:Int, author:Writer){
  //to use yearOfBirth in class novel as a field it has to be converted
  //in writer class from params to field hence it is mentioned as val yearOfBirth
  def authorAge = yearOfRelease - author.yearOfBirth 
  def isWrittenBy(author:Writer) = author == this.author
  
}


/*
 * Create class counter 
 * -receives 3 inputs
 * -method current count
 * -method to increment/decrement => new counter
 * -overload inc dec to receive an amount*/
 class Counter(val count:Int=0){
   
   def inc = new Counter(count+1)  
    //Immutability, cannot modify the instance instead create a new instance whenever the content is modified
   def dec = new Counter(count-1)
   
   def inc(n:Int):Counter={
     if (n<=0) this
     inc.inc(n+ 1)
   }
   
   def dec(n:Int):Counter={
     if(n<=0) this
     dec.dec(n-1)
   }
   
   def print=println(count)
 
   
 }