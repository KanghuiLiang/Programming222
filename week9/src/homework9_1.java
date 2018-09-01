import java.util.*;
public class homework9_1 {

		// TODO Auto-generated method stub
		
		public static void printStars(int n) {
			 if (n == 1) {
			 // base case; just print one star
			 System.out.println("*");
			 } else {
			 // recursive case; print one more star
			 System.out.print("*");
			 printStars(n - 1);
			 }
			}	
		

	}


