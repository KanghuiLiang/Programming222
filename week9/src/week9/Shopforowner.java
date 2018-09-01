package week9;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
public class Shopforowner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	   Scanner Flowers = new Scanner(System.in);  //to read user input
		
		System.out.println("Are you a owner or a customer?"
				+ "\npress 1 to enter owner vision"
				+ "\npress 2 to enter customer vision");
		
		int vision = Flowers.nextInt();
		
		switch(vision) {
		case 1: 
		
		
				
		String file = "Itemsforshop.txt"; //read the file
		
		Scanner Item = new Scanner(new File(file));
		String[][] itemlist = new String[10][2];
		int count=0;
		while(Item.hasNextLine()) {
			
		 String item = Item.nextLine(); //read the first line
		 Scanner oneword = new Scanner(item); //read the word in the line
		 String itemname=oneword.next(); // read the first word 
		 String itemprice=oneword.next(); //read the second word
		 
		 itemlist[count][0] = itemname;
		 itemlist[count][1] = itemprice;
		 count++;
		}
		System.out.println("These are what we have in our shop: ");
		for (int i=0; i< itemlist.length ; i++){
			System.out.println((i+1)+ ":" +itemlist[i][0] + " " + itemlist[i][1]);
		}
		break;
		case 2:
			System.out.println("Here are 10 kinds of Flowers we sell: "); //print each item with price
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
			
			
			System.out.print("1.Lily:");
			System.out.println(Lily);
			
			System.out.print("2.Holly:");
			System.out.println(Holly);
			
			System.out.print("3.Jasmine:");
			System.out.println(Jasmine);
			
			System.out.print("4.Daisy:");
			System.out.println(Daisy);
			
			System.out.print("5.Poppy:");
			System.out.println(Poppy);
			
			System.out.print("6.Rose:");
			System.out.println(Rose);
			
			System.out.print("7.Alyssum:");
			System.out.println(Alyssum);
			
			System.out.print("8.Iris:");
			System.out.println(Iris);
			
			System.out.print("9.Violet:");
			System.out.println(Violet);
			
			System.out.print("10.Ivy:");
			System.out.println(Ivy);
		
			// Allow users to choose items and quantity using 
			
			//while statement
			//Scanner Flowers = new Scanner(System.in);
			System.out.println("\nAre there anything you want?" //\n give space between the list and the question.
			          + "\nEnter a number to comfirm how many kinds of items you need" //to make sure the num value to run num times in for loop	     		     
			          );

	        int num = Flowers.nextInt();
	        int myFlower=0;
	        int amount =0;
	        double sum = 0;
	        
	        for(int i=0; i <num; i++) {
	        System.out.println("Select your flowers "+(i+1) +" (using ['1 - 10'] only according to list above");
	        
	        myFlower = Flowers.nextInt();  //enter a number to select which flower
	        
	        System.out.println("How many you need:" );
	        amount = Flowers.nextInt();
			String foodString = " "; //will print the flower's name
			
		    switch(myFlower) {
		    case 1 : foodString= "Lily";
		    break;
		    case 2 : foodString= "Holly";
		    break;
		    case 3 : foodString= "Jasmine";
		    break;
		    case 4 : foodString= "Daisy";
		    break;
		    case 5 : foodString= "Poppy";
		    break;
		    case 6 : foodString= "Rose";
		    break;
		    case 7 : foodString= "Alyssum";
		    break;
		    case 8 : foodString="Iris";
		    break;
		    case 9 : foodString= "Violet";
		    break;
		    case 10:foodString="Ivy";
		    break;
		        
			
			}
		    
	        switch (myFlower) {
	        case 1 : sum+= Lily*amount;
	        break;
	        case 2 : sum+= Holly*amount;
	        break;
	        
	        case 3 : sum+= Jasmine*amount;
	        break;
	        
	        case 4 : sum+= Daisy*amount;
	        break;
	        
	        case 5 : sum+= Poppy*amount;
	        break;
	        
	        case 6 : sum+= Rose*amount;
	        break;
	        
	        case 7 : sum+= Alyssum*amount;
	        break;
	        
	        case 8 : sum+= Iris*amount;
	        break;
	        
	        case 9 : sum+= Violet*amount;
	        break;
	        
	        case 10 :sum+= Ivy*amount;
	        break;
	        
	        //default : foodString = "Wrong choice";
	        //break;
	        }
	    
	        
	        System.out.println("What you want is: "+ foodString);
	       
			System.out.println("You need "+ amount +" "+ foodString );
	        
			}
		
	        System.out.println("You need to pay "+ sum);
	        
	        System.out.println("Enter the money you would like to pay: ");
	        double money = Flowers.nextDouble(); //Money is what customer pay for the first time
	        double owe; //how much money customer needs to pay more
	        double left; //How much money customer left 
	        if(money<sum) {
	        owe = sum - money;
	        System.out.println("Sorry, you still need to pay "+ owe);
	        }
	        else if(money > sum){
	        left = money - sum;
	        System.out.println("Thank you but you still have "+ left +" money left");
	        }
	        else
	        System.out.println("Thank you!Welcome for coming next time.");
	        break;
	        
	        default:
	        System.out.println("Error");
	        }
	        
	        
	    
	        	
		
			
		
	}    
	
		
		
		}
		
		
		
		
		



