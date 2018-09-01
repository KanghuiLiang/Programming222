package week9;
import java.io.*;
import java.util.*;
public class payment {

	public static void main(String[] args) throws FileNotFoundException{
		
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(new File("Itemsforshop.txt"));
		 Scanner buyItem= new Scanner(System.in);
		
		 int amount=1;
		 System.out.println("What do you want to buy?");
		 String bought= buyItem.nextLine();
		 buyItem.nextLine();
		 System.out.println("How many do you need?");
		 amount=buyItem.nextInt();
		 double sum=0;
		 
		 while(input.hasNextLine()){
	         String line= input.nextLine();
	         Scanner lineScan = new Scanner(line);
	         String item= lineScan.next();
	     
	          if(item.equals(bought))
	    	       if (lineScan.hasNextDouble()) {
	    		      sum= amount*lineScan.nextDouble();
	    		      
	    	          }
		      }
		 
		 System.out.println("What you need to pay is " + sum);
		 System.out.println("Do you still want to buy?(type 'ka' to continue, type 'na' to go to payment");
		 String buyornot= buyItem.nextLine();
		 
		 PrintStream output = new PrintStream(new File("Shoppingcart.txt"));
		    output.print(amount+" "+bought +" = " + sum );
		    output.close();
	}   
		
	
}

