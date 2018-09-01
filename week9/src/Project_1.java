import java.util.*;
import java.io.*;
public class Project_1 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
    Scanner Flowers = new Scanner(System.in);
	
    /*System.out.println("How many kinds of items your want in your shop(at least 10): ");
    int amountItem = Flowers.nextInt(); //input the amount of items
    String[] myFlowers = new String[amountItem];  //
    
    
    for(int i = 0; i < amountItem; i++) {       //when i=1 and i<=.. it will be an error.
    System.out.println("Enter your "+ (i+1) + " "+ "item name: "); //(i+1) is an addition, must be in brackets, otherwise prints i1.
    myFlowers[i]= Flowers.next();   //input the items
    
    //how can I print all the items after this (the question is already solved ) 
    // and then how can I output the text
     }
     
     System.out.println("What is the price for each item?");
     double[] moneyFlowers = new double[amountItem]; 
    
     for (int i =0; i<amountItem; i++) {
     System.out.println("Enter your " + myFlowers[i] +" " + "price: "); //can tell users to enter price to the exact items
     moneyFlowers[i] = Flowers.nextDouble();  //input the price
    
     }
    
     System.out.println("This is the price list:"); 
     
     for(int i=0; i<amountItem;i++) {
     System.out.println("The price of "+ myFlowers[i] + " is "+ moneyFlowers[i]);
     } //show all the items with prices
     
     //Above it is for the owner...
    
     /* Scanner readItem = new Scanner(new File("log.txt"));
     for (int i=0; i<amountItem; i++) {
     while (readItem.hasNextLine())
     	myFlowers[i]= readItem.nextLine() + '\n';
 	readItem.close();}
     
     for (int i=0; i<amountItem; i++) {
 	PrintStream output = new PrintStream(new File("log.txt")); //print the items into txt
     output.println(myFlowers[i] + " : "+ moneyFlowers[i]);
     output.close();
    
 	} */
     
     //for customers
     //Flowers.nextLine(); 
     //Flowers.nextLine(); //press enter to go into the customer vision; 
     System.out.println("Here are 10 kinds of flowers we sell:");
		String [] myItem = {"Lily","Holly","Jasmine","Daisy","Poppy","Rose","Alyssum","Iris","Violet","Ivy"};
		double[] itemPrice = {10.0, 11.0, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		for (int i = 0; i < myItem.length; i++) {
			System.out.println(myItem[i] + " "+ itemPrice[i]);
		} //use array and for loop to print all the items
		
		/*System.out.println("The price of each item (baht):"); //print the price of each item
		double Lily = 10;
		double Holly= 12;
		double Jasmine = 12;
		double Daisy= 15;
		double Poppy= 16;
		double Rose= 20;
		double Alyssum= 20;
		double Iris= 25;
		double Violet= 25;
		double Ivy= 30;
		
		System.out.print("Lily:");
		System.out.println(Lily);
		
		System.out.print("Holly:");
		System.out.println(Holly);
		
		System.out.print("Jasmine:");
		System.out.println(Jasmine);
		
		System.out.print("Daisy:");
		System.out.println(Daisy);
		
		System.out.print("Poppy:");
		System.out.println(Poppy);
		
		System.out.print("Rose:");
		System.out.println(Rose);
		
		System.out.print("Alyssum:");
		System.out.println(Alyssum);
		
		System.out.print("Iris:");
		System.out.println(Iris);
		
		System.out.print("Violet:");
		System.out.println(Violet);
		
		System.out.print("Ivy:");
		System.out.println(Ivy);*/
	
		// Allow users to choose items and quantity using 
		
     
     System.out.println("Are there anything you want?"
				      + "\ntype N to Exit");
     String order = Flowers.next();
     while(order != "N"){
     if(order == "Lily"){
    	 System.out.print("OK");
     }else if (order == "N"){
    	 System.out.print("You added "+order+" with the price");
     }
     }
		/*String choose = Flowers.nextLine();
		do {
		System.out.println("Type item you want: ");
		choose+= Flowers.nextLine();
		}
		while (!choose.equals("N"));

		System.out.println(choose);*/
		
      Flowers.close();
   
}
}
