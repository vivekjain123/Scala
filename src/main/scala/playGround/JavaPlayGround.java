package playGround;

public class JavaPlayGround {
 public static void main(String args[]) {
	 //Below is called class level functionality
	 //We can access the N_EYES directly using the person class instead of using the instance of a class
	 System.out.println(Person.N_EYES);
 }
}


class Person{
	public static final int N_EYES =2;
}