import java.util.*;
public class lab7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner(System.in);
		System.out.println("Let us guess a number!");
		int num=(int)(Math.random()*10);
		int num1;
		do{
			System.out.print("Enter the number:");
			num1=console.nextInt();
			if(num1<num){
				System.out.println("The number you enter is too low!");}
				else if (num1>num){
			System.out.println("The number you enter is too high");
				}
		}
		
		while (num1 != num); 
			System.out.println("Congratulation you are correct!!!");
		
		}

	}

	
