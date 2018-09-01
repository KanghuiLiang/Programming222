import java.util.*;
public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		//String printResult=""; 
		
		System.out.print("Enter first number:");
		int number1=console.nextInt();
		
		System.out.print("Enter second number:");
		int number2=console.nextInt();
		
		System.out.println("1 to " +number1 + "+" + number2
				+ "\n2 to " +number1 + "-" + number2
				+ "\n3 to " +number1 +"*"+number2
				+ "\n4 to " +number1+"/"+number2
				+ "\nEnter third number(1-4 only):");
		int number3=console.nextInt();
		
		if (number3==1){
			System.out.println(number1+number2);
			}
		else if(number3==2){
			System.out.println(number2-number1);
		}
		else if(number3==3){
			System.out.println(number1*number2);
	}
		else if(number3==4){
			System.out.println(number1/number2);
			}
		else {System.out.println("Error");
}
		console.close();
	}
}
