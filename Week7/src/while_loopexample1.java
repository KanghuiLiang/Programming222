import java.util.*;
public class while_loopexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner console =new Scanner (System.in);
    int sum=0;
    //pull one prompt/read ("post") out of the loop 
   // System.out.print("Enter a number (-1 to quit):");
    int number = console.nextInt();
    
    while (number !=-1) {
    	sum =sum + number; //moved to top of loop
        System.out.print("Enter a number (-1 to quit):");
        number = console.nextInt();
      
    }
	System.out.println("The total is "+ sum);
	}

}
