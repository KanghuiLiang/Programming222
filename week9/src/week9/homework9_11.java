package week9;
import java.io.*;
import java.util.*;

public class homework9_11 {

	public static void main(String[] args) 
	throws FileNotFoundException{
		// TODO Auto-generated method stub
	Scanner input = new Scanner (new File ("/Users/hui/Documents/workspace/week9/src/homework9_1.txt"));
	PrintStream out=new PrintStream(new File("/Users/hui/Documents/workspace/week9/src/homework9_1.txt"));
	while (input.hasNextLine()) {
		String line = input.nextLine();
		Scanner lineScan = new Scanner (line);
		int id = lineScan.nextInt();
		String name = lineScan.next();
		double sum = 0.0;
		int count = 0;
		while (lineScan.hasNextDouble()) {
			sum = sum + lineScan.nextDouble();
			count++;
		}
		double average = sum /count;
		out.println(name + "(ID#" + id + ") worked " + sum + " hours"
				+ " ("+ average + " hours/day)");
	}
		

	}

}
