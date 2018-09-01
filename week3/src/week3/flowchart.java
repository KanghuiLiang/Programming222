package week3;
import java.util.Scanner;
public class flowchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console =new Scanner(System.in);
		System.out.print("Enter number 1=");
		double number1=console.nextDouble();
		
		System.out.print("Enter number 2=");
		double number2=console.nextDouble();
		
		System.out.println("------------------------------");
		
		System.out.println("Your first number is "+number1+"");
		System.out.println("Your second number is "+number2+"");
		
		System.out.println("------------------------------");
		
		double Sum=number1+number2;
		double Average=(number1+number2)/2;
		
		System.out.println("Sum is "+Sum+"");
		System.out.println("Average is "+Average+"");
		
		System.out.println("------------------------------");
		
		if (number1 > number2){
			System.out.println("number 1 is more than number 2.");}
		else{System.out.println("number 2 is more than number 1.");}
	}

	

}
