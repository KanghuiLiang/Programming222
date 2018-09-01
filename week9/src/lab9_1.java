import java.io.*;
import java.util.*;
public class lab9_1 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		throws FileNotFoundException{
		//PRINT ALL OF IT
		/* File fs = new File("CourseSample.txt");
		Scanner input = new Scanner(fs);
		while (input.hasNext()){
			String line = input.nextLine();
			Scanner wordscan = new Scanner(line);
			wordscan.next();
			System.out.print(wordscan.nextLine());
			System.out.println();
		} //ignore the first word
		*/
		
		
		File fs = new File("CourseSample.txt");
		
		String[][] b = new String[4][2];
		if (fs.exists()){
			
			Scanner input = new Scanner(fs);
			int count = 0;
			while (input.hasNextLine()) { 
				String line = input.nextLine(); 
				Scanner readline = new Scanner(line);
				
				String code=readline.next();
				
				String descript= " "; 
			
			
				while(readline.hasNext()){
					String a = readline.next();
					if (a.equals("Pre:")){
						//System.out.println("Hello");
						break;
					}
					else{
						descript += a+ " ";
					}
				}
				b[count][0]=code;
				b[count][1]=descript;
			     count++;
				System.out.println(descript + " " + code);
				
			} 
			
	
		}
		else
			System.out.println("Cannot find the file"); 
		

	}
	
}


