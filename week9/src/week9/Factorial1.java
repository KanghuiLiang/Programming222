package week9;
import java.io.*;
import java.util.*;


public class Factorial1 {
	


		public static void main(String[] args) throws FileNotFoundException{
				
				Scanner console = new Scanner(System.in);
				System.out.print("Enter your number for factorial:");
				int number = console.nextInt();
				int result = factorial(number);
				System.out.print("Factorial of " + number + " is " + result + ".");
				
				Scanner readlog = new Scanner(new File("log.txt"));
				String currentlog ="";
				while (readlog.hasNextLine())
					currentlog += readlog.nextLine() + '\n';
				readlog.close();
				
				PrintStream output = new PrintStream(new File("log.txt"));
				output.println(currentlog + "Factorial of " + number + " is " + result + ".");
				output.close();
		}
		public static int factorial(int n){
			if( n == 0) 
				return 1;
			return n*factorial(n-1);
		}
	}
