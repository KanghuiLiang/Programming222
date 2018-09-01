import java.util.*;
public class sdsd {
	
	public static void main(String[] args) {
	    int n=0;
		printStars(n);
		
	}
	
	public static void printStars (int n){
	Scanner console=new Scanner(System.in);
	System.out.println("enter a number(n>=0)");
	 n=console.nextInt();
		 if (n == 0) {
			 // base case; just print one star
			 System.out.println();
			 } else {
			 // recursive case; print one more star
			 System.out.println("*");
			 printStars(n - 1);
			 }
			}
}
