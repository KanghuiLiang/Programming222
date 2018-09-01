package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class PlayingWithIO {

			public static void main(String[] args) throws FileNotFoundException {
				// Console to read user input
				Scanner console = new Scanner(System.in);
				//to directly choose the file by string
				String filelo = "CourseSample.txt";
				//Read the file
				Scanner filein = new Scanner(new File(filelo));
				//Hash Map to keep the student list
				String[][] courselist = new String[4][2];
				// to count for the input
				int count = 0;
				//While file still has something to read
				while(filein.hasNextLine()){
					// Read 1 line at the time
					String getLine = filein.nextLine();
					// read the word in the line 
					Scanner word = new Scanner(getLine);
					//get the first word
					String CourseCode = word.next().trim();
					// create container for description
					String CourseDes = "";
					//get the first of description
					String nextword = word.next().trim();
					//get the description until it find Pre
					while (!nextword.contains("Pre:") && word.hasNext()){
						// add the word to the description
						CourseDes += nextword + " ";
						// get the next word
						nextword = word.next().trim();
					}
					// put the info in the hash map
					courselist[count][0] = CourseCode;
					courselist[count][1] = CourseDes;
					count++;
					//start reading
				}
				for (int i=0; i< courselist.length ; i++){
					System.out.println(courselist[i][1] + " " + courselist[i][0]);
				}
				
			}
		}