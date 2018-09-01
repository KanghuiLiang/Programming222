import java.util.*;
public class labtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
    System.out.print("Enter number of the star:");
    
    int num = input.nextInt();
   
    System.out.print("Enter \"v\" for verticle star, \"h\" for horizontal:");
    
    String letter = input.next();

    
    	if(letter.equals("v")){
    		for(int i=0; i<num; i++) {
    	  System.out.println("*");
    		}
    	}
    	else if(letter.equals("h")) {
    		for(int i=0; i<num; i++) {
    	    	  System.out.print("*");
    	    		}
        }
    	else
    		System.out.println("Error.");
    }
    
	}


