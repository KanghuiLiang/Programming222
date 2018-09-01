package week9;
import java.util.*;
import java.io.*;
public class CountwordinLine {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 // Counts the words on each line of a file
		 Scanner read =new Scanner(System.in);
		 Scanner input = new Scanner(new File("lorem.txt"));
		 System.out.print("Please enter keyword:");
		 String keyword = read.next();
		 
		 
		 int count=0;
		 while(input.hasNextLine()){
			 String getLine= input.nextLine();
		     Scanner readLine= new Scanner(getLine);
		    while (readLine.hasNext()) {
		     String word = readLine.next();
		     if(word.equalsIgnoreCase(keyword))
		        count++;
		     }
		 }
		 System.out.println("Keyword "+ keyword + " is found " + count +" time(s)");
		 }
	}


