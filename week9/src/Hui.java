	import java.io.*;
	import java.util.*;
	 
	public class Hui {
		
		  public static int factorial(int n) // here is recursion method
	      {
	              if(n >= 1){
	                      return n * factorial(n-1);}
	              else{
	                      return 1;}
	      }
	       
	        public static void main(String args[]) throws FileNotFoundException {
	               
	                System.out.print("Enter an integer(more than 0): ");
	               
	                //get input from the user
	                Scanner console = new Scanner(System.in);
	                int a = console.nextInt();
	               
	                //call the recursive function to get factorial
	                int result= factorial(a);
	                Scanner readlog = new Scanner(new File("log.txt"));
					String currentlog ="";
					while (readlog.hasNextLine())
						currentlog += readlog.nextLine() + '\n';
					readlog.close();
					
	               
	                PrintStream output = new PrintStream(new File("log.txt")); //save it out of src
	                
	            	output.println(currentlog+"Factorial of " + a + " is: " + result); //output to txt
	            	output.close();
	                System.out.println("Factorial of " + a + " is: " + result); //write on program
	        }
	       
	       
	}

