package week9;
import java.io.*;
import java.util.*;

public class homework9_123 {

	public static void main(String[] args) throws IOException{

	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	    BufferedWriter out = new BufferedWriter(new FileWriter("/Users/hui/Documents/workspace/week9/src/homework9_1.txt"));
	    try {
	        String inputLine = null;
	        do {
	            inputLine=in.readLine();
	            out.write(inputLine);
	            out.newLine();
	        } while (!inputLine.equalsIgnoreCase("eof"));
	        System.out.print("Write Successful");
	    } catch(IOException e1) {
	        System.out.println("Error during reading/writing");
	    } finally {
	        out.close();
	        in.close();
	    }
	}
}
