package week9;
import java.util.*;
import java.io.*;
public class ReadandWrite {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String anything=" ";
		writefile(anything);
		readfile(anything);
		
	}
	
	public static void writefile(String anything) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 Scanner add= new Scanner(System.in); 
	    	
		    String addthings = ""; // for all the items
		    String things="";//for the new items
			while (!things.equals("exit")) {
            System.out.println("Type what you want"
					  + "\nType 'exit' to exit");  
		          things=add.nextLine().trim(); //allow user to write what they want to add with price
		          if(things.equalsIgnoreCase("exit")){
		    	     break;
		    	   }
		          addthings+="\n"+things; // print line first coz already has previous line, in case print an extra line
			}
		   // System.out.println(addthings);
		    
//		    Scanner readLine = new Scanner(new File("log.txt")); //read file
//			String currentLine="";
//			while (readLine.hasNextLine()){
//				currentLine += readLine.nextLine();
//				if (readLine.hasNextLine())
//					currentLine += "\n";
//			}
//			 
//			readLine.close();
			
			PrintStream output = new PrintStream(new File("log.txt"));  
			output.print(addthings); //add items to the file
			output.close();// to print out into the files		} 
	}
	

	public static void readfile(String anything) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "log.txt";
		System.out.println("These are what in the file: ");
		Scanner things = new Scanner(new File(file)); //read the file
		int count=0; //count the amount of line
		
        while(things.hasNextLine()) {
			
		    String th = things.nextLine(); //read the first line
		    System.out.println(th);
		    count++;
		} 
	}

}
