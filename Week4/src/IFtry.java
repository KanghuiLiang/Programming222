import java.util.*;
public class IFtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner snacks= new Scanner(System.in);
	
	System.out.println("Write down your favorite snacks:");
	String mySnacks=snacks.nextLine();

	if (mySnacks.equalsIgnoreCase("Chip")) 
		System.out.println("Chip is great");
	
    //System.out.println(mySnacks + chip);
	else if(mySnacks.equals("HUI")) 
	System.out.println("Stupid Hui");
	
	else if(mySnacks.equals("Abc"))
	System.out.println("What is it");
	
	else
	System.out.println("Do yo have more?");
	}

}
