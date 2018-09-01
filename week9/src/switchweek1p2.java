import java.util.*;
public class switchweek1p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner (System.in);
   System.out.println("What is the date and day today?");
   int date = input.nextInt();
   
   switch(date) {
   case 1: 
	   System.out.println("Date Number:" + date + "\nMonday");
   break;
   
   case 2: 
	   System.out.println("Date Number:" + date + "\nTuesday");
   break;
   
   case 3: 
	   System.out.println("Date Number:" + date + "\nWednesday");
   break;
   
   case 4: 
	   System.out.println("Date Number:" + date + "\nThursday");
   break;
   
   case 5: 
	   System.out.println("Date Number:" + date + "\nFriday");
   break;
   
   case 6: 
	   System.out.println("Date Number:" + date + "\nSaturaday");
   break;
   
   case 7: 
	   System.out.println("Date Number:" + date + "\nSunday");
   break;
   
   default: 
	   System.out.println("Date Number:" + date + "\nError");
   break;
   
   }
	}

}
