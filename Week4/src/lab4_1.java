import java.util.Scanner;
public class lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner console=new Scanner(System.in);
		
		System.out.println("Type your three lucky numbers step by step, let us see if it is ODD or EVEN.");
		
		System.out.print("Enter the first number:");
		int number=console.nextInt();
		
		if (number%2==1){
	    System.out.println("odd");}
		else{System.out.println("Even");}
		
		
		System.out.print("Enter the second number:");
		int number1=console.nextInt();
		
		if (number1%2==1){
		    System.out.println("odd");}
			else{System.out.println("Even");}
		
		System.out.print("Enter the third number:");
		int number2=console.nextInt();
		
		if (number2%2==1){
		    System.out.println("odd");}
			else{System.out.println("Even");}
		
		System.out.println("Now you get it!!!");

	}

}
