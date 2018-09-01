import java.util.*;
import java.io.*;
public class shopForCustomer {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		/*System.out.println("Here are 10 kinds of flowers we sell:");
		String [] myItem = {"Lily","Holly","Jasmine","Daisy","Poppy","Rose","Alyssum","Iris","Violet","Ivy"};
		for (int i = 0; i < myItem.length; i++) {
			System.out.println(myItem[i]);
		} //use array and for loop to print all the items */
		
		System.out.println("Here are 10 kinds of Flowers we sell: "); //print each item with price
		double Lily = 10;
		double Holly= 12;
		double Jasmine = 12;
		double Daisy= 15;
		double Poppy= 16;
		double Rose= 20;
		double Alyssum= 20;
		double Iris= 25;
		double Violet= 25;
		double Ivy= 30;
		
		System.out.print("1.Lily:");
		System.out.println(Lily);
		
		System.out.print("2.Holly:");
		System.out.println(Holly);
		
		System.out.print("3.Jasmine:");
		System.out.println(Jasmine);
		
		System.out.print("4.Daisy:");
		System.out.println(Daisy);
		
		System.out.print("5.Poppy:");
		System.out.println(Poppy);
		
		System.out.print("6.Rose:");
		System.out.println(Rose);
		
		System.out.print("7.Alyssum:");
		System.out.println(Alyssum);
		
		System.out.print("8.Iris:");
		System.out.println(Iris);
		
		System.out.print("9.Violet:");
		System.out.println(Violet);
		
		System.out.print("10.Ivy:");
		System.out.println(Ivy);
	
		// Allow users to choose items and quantity using 
		
		//while statement
		Scanner Flowers = new Scanner(System.in);
		System.out.println("\nAre there anything you want?" //\n give space between the list and the question.		     		     
				          );
		
		int num = Flowers.nextInt();
		for(int i=0; i <num; i++) {
		System.out.println("Select your flowers "+(i+1) +" (using ['1 - 10'] according to list above");
		
		
		}
	 
		 //How can I print all the items once I finish inputting
	}
}
		
