package basics

object Recursion extends App{

  def factorial(n:Int):Int = {
    if(n<=1) 1 
    else{
     //to test the stack overflow error lets print some intermediate steps
      println(s"to get the factorial of ${n} get the factorial of ${n-1}")
      val result = n*factorial(n-1)
      println(s"computed factorial of ${n}")
      result
    }
  }
  
def tailFact(n:BigInt):BigInt={
  // when you need 
  def helper(x:BigInt, acc:BigInt=1):BigInt={
    if(x<=1) acc
    else helper(x-1,x*acc)
  }
  
  helper(n) // when recursive call is the last operation performed then it is tail recursion
}
 // println(factorial(5))
  println(tailFact(100))
  // when you need loops then use tail recursion

}