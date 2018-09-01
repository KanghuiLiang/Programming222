package week9;
import java.util.*;
import java.io.*;
public class Readfileprint {
	public static int countItem() throws FileNotFoundException {
	      Scanner input =new Scanner(new File("Itemsforshop.txt"));
	      int count=0;
	      while(input.hasNextLine()) {
	    	 System.out.println(input.nextLine());
	    	 count++;
	    }
	       input.close();
	       return count;
	    	
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	
		    
		String file = "Itemsforshop.txt";
		System.out.println("These are what in the shop: ");
		Scanner Item = new Scanner(new File(file)); //read the file
		int count=0;
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
		for (int i=0; i< itemlist.length ; i++){
		 System.out.println((i+1)+ ":" +itemlist[i][0] + " " + itemlist[i][1]);
	} 	
		   Scanner buyItem = new Scanner(System.in);
           String allItem="";
           String myItem="";
           String amount="";
           //double amount=1;
	       double sum = 0;
	    
	      
              System.out.println("Type what you want: ");
              myItem = buyItem.nextLine();  
              buyItem.nextLine();
              
            
              System.out.println("How many you need:"
           		+ "\ntype 0 to finish the shopping" );
              amount = buyItem.nextLine(); //for how many customer needs
              
     
                
           
                 allItem+= myItem +" " + amount; 
           
            
        
     
        System.out.println(allItem);
        
		
		
			
	 Scanner readLine = new Scanner(new File("Itemsforshop.txt"));
		String currentLine="";
		
			if (readLine.hasNextDouble())
				currentLine += "\n";
		 
		 
		readLine.close();
		
		;// to print out into the files
	    }
}
  
	


