import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Othersproject {



public static void main(String[] args) throws FileNotFoundException, NoSuchElementException  {
	  Scanner del= new Scanner(System.in);
	   String delete =""; //delete is for delete item
	   String adelete = ""; //adelete is for all the delete items
	   while (!delete.equals("exit")) { 
	       System.out.print("What do you want to detele?"
	   		+ "\nType 'exit' to stop");
	       delete = del.nextLine();
	       if(delete.equalsIgnoreCase("exit"))
		    	break;
	       else
	       adelete+= delete + "\n";
	   }
	   
	//   System.out.println("What you want to delete is:\n"+adelete); //print all the delete items
	   
	   Scanner inputdelete = new Scanner(new File("Itemsforshop.txt"));
	      String item="";
	      while(inputdelete.hasNextLine()){
	    	    String line = inputdelete.nextLine(); 
				Scanner readline = new Scanner(line);
			    
				while(readline.hasNext()){
					String a = readline.next();
					Double b = readline.nextDouble();
					//System.out.println(a);
					if (a.equals(adelete.trim())){
						//break;
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
}