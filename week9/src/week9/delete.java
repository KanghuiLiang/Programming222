package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
		int user = usermenu();
		accessOption(user);
	}
	public static int usermenu() {
		Scanner console = new Scanner(System.in);
		System.out.println("------------------------------\nHi Welcome to Hirohito Express!\n------------------------------" );
				System.out.println("");
		System.out.println("Who are you? \n 1.Customer \n 2.Shop Owner ");
		return console.nextInt();
	}
		public static void accessOption(int Command) throws FileNotFoundException, NoSuchElementException  {
		if (Command == 1) {
			Customer();
		}
		else if (Command == 2) {
			shopOwner();
		}
		else  {
			System.out.println("Print Error");
		}
		}

public static void shopOwner() throws FileNotFoundException {
Scanner console = new Scanner(System.in);
System.out.println("------------------------------\nWelcome my owner!\n------------------------------\n" );
		System.out.println("");
System.out.println("Here your command. \n 1. Item list. \n 2. Add item. \n 3. Remove item. \n 4. Change price. ");


int Command = console.nextInt();
console.nextLine();

if (Command == 1) {
	printItem();
}
else if (Command == 2) {
	addItem();
}
else if (Command == 3) {
	RemoveItem();
}
else if (Command == 4) {
	ChangePrice();
}
else  {
	System.out.println("Print Error");
}

shopOwner();

}

	public static void printItem() throws FileNotFoundException{

		File Itemlist = new File("Itemsforshop.txt");

			Scanner scanner = new Scanner(Itemlist);
			while( scanner.hasNextLine()){
				String Lnumber = scanner.nextLine();
				String[] items = Lnumber.split(":");
				if(items.length == 2){
					System.out.println( items[0] + " : " + "$"+items[1] );
				}
			}
	}
	public static void addItem() throws FileNotFoundException {

		Scanner readlog = new Scanner(System.in);
		System.out.println("Add an item:");
		 /*Find the file path and add new items*/
		String filePath = "Item.txt";
		String ItemAdded = readlog.nextLine();
		System.out.print("Enter item price:");
		Double price = readlog.nextDouble();
				
				PrintStream output = new PrintStream(new FileOutputStream(filePath, true));
				output.println(ItemAdded +":" + price);
				System.out.println("------------------------------\nAdd item success !\n------------------------------");
				
	}
	public static void RemoveItem() {
System.out.println("Please type the number line of an item to remove");
Scanner readlog = new Scanner(System.in);
int DeleteItem = readlog.nextInt();
String file = "Item.txt";
try {
	Scanner Removedlist = new Scanner(new File(file));
	String Removed = "";
	int itemCount = 0;
	while(Removedlist.hasNextLine()){
		itemCount++;
		if(itemCount == DeleteItem){
			Removedlist.nextLine();
		}else{
			Removed += Removedlist.nextLine() + "\n";
		}
	}
	Removedlist.close();
	PrintStream output = new PrintStream(new FileOutputStream(file));
	output.print(Removed);
	System.out.println("------------------------------\nItem has been removed !\n------------------------------");
	output.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	public static void ChangePrice(){
		System.out.print("Please type the number line of an item for price changer:");
		Scanner scanner = new Scanner(System.in);
		int readlog = scanner.nextInt();
		System.out.println("Enter the new price:");
		Double newPrice = scanner.nextDouble();
		String file = "Item.txt";
		try {
			Scanner ItemLog = new Scanner(new File(file));
			int itemCount = 0;
			String stringItems = "";
			while( ItemLog.hasNextLine()){
				itemCount++;
				if(itemCount == readlog){
					String line = ItemLog.nextLine();
					String[] items = line.split(":");
					if(items.length == 2){
						stringItems += items[0]+":"+newPrice+"\n";
					}
				}else{
					stringItems += ItemLog.nextLine() +"\n";
				}
			}
			ItemLog.close();
			PrintStream output = new PrintStream(new FileOutputStream(file));
			output.print(stringItems);
			System.out.println("------------------------------\nThe price has been changed !\n------------------------------");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
	}
	public static void Customer() throws FileNotFoundException, NoSuchElementException  {
		File Item = new File("Itemsforshop.txt");
		Scanner console = new Scanner(System.in);
		System.out.println("------------------------------\nWelcome to Hirohito Express!\n------------------------------\nYou can buy anything here" );
				System.out.println("");
				printItem();
				addItemsToCart();
	}
	public static String chooseItem(){
		System.out.print("Enter items's line that you want to buy:");
		Scanner scanner = new Scanner(System.in);
		int itemsLine = scanner.nextInt();
		String filePath ="Itemsforshop.txt";
		try {
			Scanner fileScanner = new Scanner(new File(filePath));
			int number = 0;
			String stringItems;
			while( fileScanner.hasNextLine()){
				number++;
				if (itemsLine == number){
					return fileScanner.nextLine();
				}else{
					fileScanner.nextLine();
				}
			}
		} catch (FileNotFoundException error) {
			
			error.printStackTrace();
		}
		return "";
	}
	public static String addItemToCart(){      	 
		String item = chooseItem();             		
		System.out.print("How much:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();   	
		if(!item.isEmpty()){                      	
			String itemPerEach = item +":"+number;
			return itemPerEach;             	
		}else{
			return "";            					
		}
	}
	public static void addItemsToCart(){        		 
		Scanner scanner = new Scanner(System.in);	
		String stringItems = "";						
		while(true){									
			String item = addItemToCart();   		
			if(!item.isEmpty()){             		
				if(stringItems.isEmpty()){    		
					stringItems = item;       		
				}else{
					stringItems += "#" + item;						
					
				}							
			}
			System.out.print("Do you want to add more item? Y/N:");
			char option = scanner.nextLine().toLowerCase().charAt(0);
			if(option == 'n') break;
		}
		
		String[] lines = stringItems.split("#");				
		double total = 0;									
		for(int i=0; i<lines.length; i++){					
		
			String[] parts = lines[i].split(":");			
														
			if(parts.length == 3){								
				double price = Double.parseDouble(parts[1]);		
				int number = Integer.parseInt(parts[2]);		
				total += price*number;							
			}else{
				System.out.println("Items not found");
			}
		}
		System.out.println("Total price: "+total+"$");
		
		double payment = 0;
		while(true){
			System.out.print("Please enter the amount of money for your purchase order:");
			payment += scanner.nextDouble();
			if(payment < total){
				System.out.println("You need "+ "$"+(total - payment)+" more");
				
			}else if (payment > total){
				System.out.println("Here's your change: "+"$"+(payment - total));
				break;
			}else{
				break;
			}
		}
		
		try {
			System.out.println("**************your payment is done!**************\nHere's your receipt !\n------------------------------\nThank you for your purchase!\n------------------------------");
			PrintStream output = new PrintStream(new File("Receipt"));
			output.println("Product     Price     Number");
			
			for(int i=0; i<lines.length; i++){
				String[] parts = lines[i].split(":");			 
				if(parts.length == 3){
					output.println(parts[0]+"     " + parts[1] + "  :      " + parts[2]);	
				}
				
			
			}
			output.println("Total: $" + total);
			output.println("Your payment is: $"+payment);
			output.println("Your change is: $"+(payment-total));
			output.println("------------------------------Thank you for your purchase!------------------------------");
			output.println("Have a nice day!");
		} catch (FileNotFoundException error) {
			
			error.printStackTrace();
		}
	}
}
	

