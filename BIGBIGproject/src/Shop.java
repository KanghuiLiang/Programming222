import java.io.*;
import java.util.*;
public class Shop {
    public static int countItem() throws FileNotFoundException {
      Scanner input =new Scanner(new File("Itemsforshop.txt"));
      int count=0;
      while(input.hasNextLine()) {
    	 System.out.println(input.nextLine());
    	 count++;
      }
      input.close();
      return count;
    	
    } //to count how many items in the file

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 Scanner Flowers = new Scanner(System.in);
		 
		 System.out.println("Are you an owner or a customer?"
					+ "\npress 1 to enter owner version"
					+ "\npress 2 to enter customer version");
		 int version = Flowers.nextInt(); //enter number to choose which version
		
		 while(version==1) //when it is 1, it will run owner version again and again.
			   owner();    
		 while(version==2) // go to customer version
			   Customer();
	}
		
	public static void File() throws FileNotFoundException{		
		String file = "Itemsforshop.txt";
		System.out.println("These are what in the shop: ");
		Scanner Item = new Scanner(new File(file)); //read the file
		int count=0; //count the amount of line
		String[][] itemlist = new String[countItem()][2];  
		
		while(Item.hasNextLine()) {
			
		    String item = Item.nextLine(); //read the first line
		    Scanner oneword = new Scanner(item); //read the word in the line
		    String itemname=oneword.next(); // read the first word 
		    String itemprice=oneword.next(); //read the second word
		 
		    itemlist[count][0] = itemname;
		    itemlist[count][1] = itemprice;
		    count++;
		} 
	}
    public static void owner() throws FileNotFoundException{
	    File(); //call the file
		Scanner add= new Scanner(System.in);  
		
		System.out.println("\nDo you want to make any changes for your items?"
				+ "\nPress 1 to add some items"
				+ "\nPress 2 to delete the item"
				+ "\nPress 3 to change the price"
				+ "\nPress any other number to exit");
		int Choices = add.nextInt();   // make choice to add/delete/change price
		
		if(Choices==1)
			add(); //addition version
		else if (Choices==2)
			delete(); //delete version
		else if (Choices==3)
			changeprice();//change price version
		else
			System.out.println("Thank you");
    }
	public static void add() throws FileNotFoundException{
		    Scanner add= new Scanner(System.in); 
    	
		    String addItem = ""; // for all the items
		    String newItem="";//for the new items
			while (!newItem.equals("exit")) {
                  System.out.println("What do you want to add?(Write their items with price)"
					  + "\nType 'exit' to stop");  
		          newItem=add.nextLine().trim(); //allow user to write what they want to add with price
		          if(newItem.equalsIgnoreCase("exit")){
		    	     break;
		    	   }
		          addItem+="\n"+newItem; // print line first coz already has previous line, in case print an extra line
			}
		    System.out.println(addItem);
		    
		    Scanner readLine = new Scanner(new File("Itemsforshop.txt")); //read file
			String currentLine="";
			while (readLine.hasNextLine()){
				currentLine += readLine.nextLine();
				if (readLine.hasNextLine())
					currentLine += "\n";
			}
			 
			readLine.close();
			
			PrintStream output = new PrintStream(new File("Itemsforshop.txt"));  
			output.print(currentLine + addItem); //add items to the file
			output.close();// to print out into the files
		    }
	
	public static void changeprice()  throws FileNotFoundException{
		   Scanner add= new Scanner(System.in);
		   String achange = ""; //for all the changes 
		
		   System.out.println("What item do you want to make change of their price(Write their name)?");
		   String makeChange = add.nextLine(); //for the change item
		   
		   System.out.println("Write down your new price of this item: ");
		   double priceadd= add.nextDouble(); //for new price
		   achange+=makeChange+" "+priceadd; 
		     
		   System.out.println("This is what you have changed: "+achange);
		   
		  
		   Scanner inputdelete = new Scanner(new File("Itemsforshop.txt")); //read the file
		   String item="";
		   while(inputdelete.hasNextLine()){
		    	 String line = inputdelete.nextLine(); 
			     Scanner readline = new Scanner(line);
				    
				 while(readline.hasNext()){
				       String a = readline.next();
					   Double b = readline.nextDouble();
					   if (a.equals(makeChange.trim())){  //instead of deleting it, replace it with new price
						   item+= a+" "+ priceadd;
						   }
					   else 
					    	item+= a+" "+ b;
						 if (inputdelete.hasNextLine()) 
	         					item += "\n"; 
					    }   
		            }
		    	      
		    PrintStream output = new PrintStream(new File("Itemsforshop.txt")); 
		    output.print(item);  //print to file
		    output.close();
		    }
		
    public static void delete() throws FileNotFoundException{

		       Scanner del= new Scanner(System.in);
		 
		       System.out.print("What do you want to detele?");
		       String delete = del.nextLine(); //for the delete item
		       System.out.println("What you want to delete is " +delete);
		      
		   
		       Scanner inputdelete = new Scanner(new File("Itemsforshop.txt")); // read the file
		       String item=""; 
		       while(inputdelete.hasNextLine()){
		    	    String line = inputdelete.nextLine(); 
					Scanner readline = new Scanner(line);
				    
					while(readline.hasNext()){
						String a = readline.next();
						Double b = readline.nextDouble();
						//System.out.println(a);
						if (a.equals(delete.trim())){
							
						}
					    else {
                         item+= a+" "+ b;
                         if (inputdelete.hasNextLine())
         					item += "\n"; //!!!
					    }    
					}	       
		      }   	      
		      PrintStream output = new PrintStream(new File("Itemsforshop.txt"));
		      output.print(item);
		      output.close();// to print out into the files
		  }
         //owner vision end
	public static void Customer() throws FileNotFoundException { //use array 
		     Scanner cust= new Scanner(System.in);
		     System.out.println("\t\t\t\t--------------------");
		     System.out.println("\t\t\t\tWelcome to our shop!");
		     System.out.println("\t\t\t\t--------------------");
		       File(); //call the File method
		       BuyItem();  
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
    	  
             Scanner payment = new Scanner(System.in);
             System.out.println("Enter the money you would like to pay: ");
             double money = payment.nextDouble(); //Money is what customer pay for the first time
             System.out.println("What you buy:"+ bought
            		 +"\nThe amount you buy:"+amount
            		 +"\nSum of payment:"+sum);  //Print the receipt 
             
             
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
  
             Scanner readLine= new Scanner(new File("Shoppingcart.txt")); //read the file
			 String currentline =""; 
			 while (readLine.hasNextLine())
				currentline += readLine.nextLine() + '\n';
			 readLine.close(); //to scan the previous shopping list
            
   		     PrintStream output = new PrintStream(new File("Shoppingcart.txt"));
   		     output.print(currentline+amount+"*"+bought +" = " + sum ); //add the new receipt
   		     output.close();
         }
}
	
		



