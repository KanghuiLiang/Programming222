import java.util.*;
public class theequal_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in); System.out.print("What is your name? "); 
		String name = console.next();
		if (name == "Barney") 
		    { 
		        System.out.println("I love you, you love me,");
		        System.out.println("We're a happy family!");
		     } 
		
		
		// Relational operators such as < and == fail on objects 
		//This code will compile, but it will not print the song
		// == compares objects by references, so it often gives false even when two String
		//have the same letters
		
		//The equals method
	   
		/*Scanner console1 = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name1 = console1.next();
		if (name1.equals("Barney")) {
		   System.out.println("I love you, you love me,");
		  System.out.println("We're a happy family!");
		} */
		// Technically this is a method that returns a value of type boolean the typw used in logic tests
		
		System.out.print("What is your name? ");
		String name12 = console.next();
		if (name12.startsWith("Prof")) {
		 System.out.println("When are your office hours?");
		} else if (name12.equalsIgnoreCase("STUART")) {
		 System.out.println("Let's talk about meta!");
		}
	}

}
