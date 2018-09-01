package week9;

import java.util.Scanner;

public class db2week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    
		    System.out.println("What is the date and day today?");
		    int date = input.nextInt();
		    if ( date == 1) {
		    System.out.println("Date Number:" + date + "\nMonday");
		    }
		    else if ( date == 2) {
			    System.out.println("Date Number:" + date + "\nTuesday");
			    }
		    else if ( date == 3) {
			    System.out.println("Date Number:" + date + "\nWednesday");
			    }
		    else if ( date == 4) {
			    System.out.println("Date Number:" + date + "\nThursday");
			    }
		    else if ( date == 5) {
			    System.out.println("Date Number:" + date + "\nFriday");
			    }
		    else if ( date == 6) {
			    System.out.println("Date Number:" + date + "\nSaturday");
			    }
		    else if ( date == 7) {
			    System.out.println("Date Number:" + date + "\nSunday");
			    }
		    else {
			    System.out.println("Date Number:" + date + "\nError");
		    }
	}

}
