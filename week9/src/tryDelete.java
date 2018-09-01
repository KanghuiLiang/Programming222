import java.io.*;
import java.util.*;

public class tryDelete {

	public static void main(String[] args) throws FileNotFoundException {
		   Scanner choice = new Scanner(System.in);
		   System.out.println("press 1 to buy, 2 to pay");
	    int ch=choice.nextInt();
		while(ch==1)
	   BuyItem();
		//while(ch==2)
		//Payment();
		
	}
		  public static void BuyItem() throws FileNotFoundException { 		
	    		// TODO Auto-generated method stub
	    		 Scanner input = new Scanner(new File("Itemsforshop.txt"));
	    		 Scanner buyItem= new Scanner(System.in);
	    		
	    		 int amount=0; // for the amount of item
	    		 double sum=0; // for the sum of payment
	    		 
	    		 System.out.println("What do you want to buy?");
	    		 String bought= buyItem.nextLine();
	    		 
	    		 System.out.println("How many do you need?");
	    		 amount=buyItem.nextInt();
	    		 
	    		 
	    		 while(input.hasNextLine()){
	    	         String line= input.nextLine();
	    	         Scanner lineScan = new Scanner(line);
	    	         String item= lineScan.next();
	    	     
	    	          if(item.equals(bought))
	    	    	      if (lineScan.hasNextDouble()) {
	    	    		      sum= amount*lineScan.nextDouble();
	    	    	          }
	    		     }   //to scan the item the customer want
	    		 
	    		 System.out.println("What you need to pay is " + sum);
	    	 
	    	      
	    		 Scanner readLine= new Scanner(new File("Itemforshop.txt")); //read the file
	    		 String currentline =""; 
	    		 while (readLine.hasNextLine())
	    			currentline += readLine.nextLine() + '\n';
	    		 readLine.close(); //to scan the previous shopping list
	         
	    	     PrintStream output = new PrintStream(new File("Itemforshop.txt"));
	    	     output.print(currentline+amount+" "+bought+" "  + sum ); //add the new receipt
	    	     output.close();
	    	     
	    	     Payment();
	    	     
		  }
		  //Print the receipt 
	      
 public static void Payment()  throws FileNotFoundException {
	Scanner input = new Scanner (new File("Itemforshop.txt"));
	
	while (input.hasNextLine()) {
	    String line = input.nextLine();
	    Scanner lineScan = new Scanner(line);
	    int amount = lineScan.nextInt();
	    String bought = lineScan.next();
	    double sum = 0.0;
	    int count = 0;
	    while (lineScan.hasNextDouble()) {
	    sum += sum + lineScan.nextDouble();
	   count++; 
	    }
	    
		 Scanner payment = new Scanner(System.in);
	      System.out.println("Enter the money you would like to pay: ");
	      double money = payment.nextDouble(); //Money is what customer pay for the first time
	      System.out.println("What you buy:"+ bought
	     		 +"\nThe amount you buy:"+amount
	     		 +"\nSum of payment:"+sum); 
      //To calculate the payment 
      double owe; //how much money customer needs to pay more
      double left; //How much money customer left
      if(money<sum) {
         owe = sum - money;
         System.out.println("Sorry, you still need to pay "+ owe);
        }
      else if(money > sum){
         left = money - sum;
         System.out.println("Thank you!But you still have "+ left +" money left");
         }
      else
         System.out.println("Thank you!Welcome to come next time.");

      
  }
     }
 
}



