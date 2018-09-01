package week3;
import java.util.Scanner;
public class Lab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name =console.nextLine();
		
		System.out.println("How old are you?");
		int age =console.nextInt();
		console.nextLine();
		
		System.out.println("Where are you from?");
		String country=console.nextLine(); /*String country=console.next(); 
		it is also working for only one word. */
		
		
		System.out.println("What is your hobby?");
		String hobby=console.nextLine();
		
		System.out.println("What is your favorite food?");
		String food=console.nextLine();
		
		System.out.println("What is your current GPA?");
		double GPA=console.nextDouble();
		
		
		System.out.println("My name is "+name+"");
		System.out.println("I am "+age+" years old.");
		System.out.println("I am from "+country+".");
		System.out.println("I love to eat "+food+".");
		System.out.println("My current GPA is "+GPA+".");
		
		
		

	}

}
