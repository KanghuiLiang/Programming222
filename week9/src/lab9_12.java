import java.io.*;
import java.util.*;
public class lab9_12 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		throws FileNotFoundException{
		//throws is not in {}
		
	    File fs = new File("CourseSample.txt");
	    if (fs.exists()) //check if the file exists
	       {
	    Scanner input = new Scanner(fs);
		
	    while (input.hasNextLine()) { 
				String line = input.nextLine();   
				Scanner readline = new Scanner(line);  //scan the whole line 
		        String code=readline.next();  //Scan the first word of each line
		        String descript= " ";         //Scan the rest? 
			
		   while(readline.hasNext()){
		       String a = readline.next();  // a is for each word after the first word
			   if (a.equals("Pre:")){
			   break; //skip the whole sentence when there is pre:
					}
		  
		   else{
				descript += a+ " ";   //descript+ is for all the description
					}
				}
				
				System.out.println(descript + " " + code); // "  " is for more space
				
			}
			
	
		}
		else
			System.out.println("Cannot find the file");
		

	}
	
}


