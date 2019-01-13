package objectOriented

object Objects extends App{
  
 /*scala doesnot have class level functionality("static")
  A static variable is common to all the instances (or objects) of the class
   because it is a class level variable. In other words you can say 
   that only a single copy of static variable is created and shared 
   among all the instances of the class. Memory allocation for 
  such variables only happens once when the class is loaded in the memory.
  */
  
//scala object is a singleton instance i.e it has only one instance that it can rever to 
  
object Person {
  val N_EYES =2
  def canFly: Boolean = false 
}

println(Person.N_EYES)
println(Person.N_EYES)



val dd = Person

val aa = Person
println(dd == aa)
  
}