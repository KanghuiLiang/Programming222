package week3;

import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.println("Now let us do some interesting math!");
		System.out.println("Press ENTER to start");
		
		console.nextLine();
		
		System.out.print("Enter first number");
		double first =console.nextDouble();
		
		System.out.print("Enter second number");
		double second =console.nextDouble();
		
		System.out.print("Enter third number");
		double third =console.nextDouble();
		
		System.out.print("Enter forth number");
		double forth =console.nextDouble();
		
		System.out.print("Enter fifth number");
		double fifth =console.nextDouble();
		
		double a=forth+fifth;
		double b=a*first;
		double c=b/second;
		
		System.out.println(c);
		console.nextLine();
		console.nextLine();
		
		System.out.println("Each step you enter a number, it will go to type next number.");
		System.out.println("The final result is that:");
		System.out.println("First, the forth input plus the fifth input equal to a,");
		System.out.println("Second, the sum(a) you get the former step, multiplies the first input," );
		System.out.println("Last, it is the number(b) you get from the former step divides the second input.");
       

	}

}
