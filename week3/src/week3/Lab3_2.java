package week3;

import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		
		System.out.println("Type your three lucky numbers, let us see if it is ODD or EVEN.");
		
		System.out.print("Enter the first number:");
		int number=console.nextInt();
		
		String oddeven =number%2==1? "Odd":"Even";
		System.out.println(oddeven);
		
		
		System.out.print("Enter the second number:");
		int number1=console.nextInt();
		
		String oddeven1=number1%2==1? "Odd":"Even";
		
		System.out.println(oddeven1);
		
		
		System.out.print("Enter the third number:");
		int number2=console.nextInt();
		
		String oddeven2 =number2%2==1? "Odd":"Even";
		System.out.println(oddeven2);
		
		System.out.println("Now you get it!!!");
		
		
		
	}

}
