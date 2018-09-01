package programming2Week2;

import java.util.*;
public class quizzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
//		System.out.println("What do you wannt to be? \n1.Mage \n2.Archer \n3.Warrior");
//	    System.out.print("Your input: ");
//		int num = input.nextInt();
//		
//		switch (num) {
//		case 1: 
//			System.out.println("You have choosen to be Mage");
//		break;
//		
//		case 2: 
//			System.out.println("You have choosen to be Archer");
//		break;
//		
//		case 3: 
//			System.out.println("You have choosen to be Warrior");
//		break;
//		
//		default:
//			System.out.println("Wrong input");
//		break;
//		}
//		System.out.println("''''Done''''");
//		
		String[] result = {"I","L","O","V","E","P","G","2"}; 
		
//		for(int i=0; i<result.length; i++) {
//			System.out.print(result[i]);
//		}
//		System.out.println();
//		for(int i=1; i<result.length; i++) {
//		System.out.println(result[i]);
//		}
//		
		Scanner console = new Scanner(System.in);
		System.out.println("Lets cauculate number of hours you sleep.");

		System.out.print("Please enter number of hours you sleep perday:");

		int hours_sleep = console.nextInt();

		System.out.print("Please enter number of date you want to calculate:");

		int day_sleep = console.nextInt();

		int sleepinghr = CalculateSleep(hours_sleep,day_sleep);

		showdata(hours_sleep,day_sleep,sleepinghr);

		}
	
	  public static int CalculateSleep(int int1, int int2) {
		  return int1 + int2;
	  }
	  
	  public static int showdata(int i1,int i2,int i3) {
		  System.out.println("Sleeping " + i1+ "for " + i2 + " will make you sleep for "+i3);
		  return i1 + i2 +i3;
	  }
	  
	}

