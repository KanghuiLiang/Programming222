import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner buyItem = new Scanner(System.in);
        String allItem="";
        String myItem="";
        double amount=1;
	    double sum = 0;
	    
	    while(!myItem.equals("exit")){
           System.out.println("Type what you want: ");
           myItem = buyItem.nextLine();  
           allItem+=myItem;
           buyItem.nextLine(); 
           System.out.println("How many you need:"
        		+ "\ntype 0 to finish the shopping" );
           amount = buyItem.nextDouble(); //for how many customer needs
           allItem+= myItem+amount;
        } 
     
	       
     
     System.out.println("What you want is: "+  allItem);
     
		
     System.out.println("You need to pay "+ sum);
     
     
	
	}

}
