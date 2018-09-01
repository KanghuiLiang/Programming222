import java.util.*;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //array:object that stores many values of the same type
	//element:one value in an array
	//index: A 0-based integer to access an element from an array
		
	//Array declaration
	//type[] name= new type[length];
	//example:
	// int[] numbers= new int[10];
	// double[] results =new double[5];
		
		
	//Arrays and for loops
	//It is common to use for loops to access array elements.
		
		int[] numbers =new int [10];
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
		System.out.println(); //output: 0 0 0 0 0 0 0 0 0 0
	
	
	
	    int [] numbers1 =new int [10];
	    for (int j = 0; j< numbers1.length; j++) {
	    	numbers1[j] = 2* j;
	    	System.out.print(numbers1[j]+" "); 
	    }
	    System.out.println();
	    System.out.println(Arrays.toString(numbers1));
	    
	    //Quick array initialization 
	    //type[] name = {value, value, ... value};
	    //example
	    //int [] numbers = {12,49,-2,26,5,17,-6};
	    // useful when you know what the array's elements will be
	    //the compiler figures out the size by counting the values
	    
	    //limitation of arrays
	    
	    //You cannot resize an existing array:
	    // int [] a =new int[4];
	    // a.length =10; //error
	    
	    //You cannot compare arrays with == or equals:
	     int[] a1 ={42,-7,1,15};
	     int[] a2 ={42,-7,1,15};
	     //if (a1 == a2) {....} //false!
	    //if (a1.equals(a2)) {...} //false!
	     
	     //an array does know how to print itself
	      int[] a3={42,-7,1,15};
	      System.out.println(a1); //[I@677327b6
	      
	      int[] e ={0,2,4,6,8};
	      e[1] = e[3] + e[4]; //e[1] = 6+8, e[1] is the second number..
	      System.out.println("e is " + Arrays.toString(e) ); //output: e is [0, 14, 4, 6, 8]
	      
	      //the first way to do (list all the things
	      String[] studentsNames = new String[3];
	      studentsNames[0]="Bob";
	      studentsNames[1]="Tony";
	      studentsNames[2]="Hui";
	      for (int k=0; k<studentsNames.length; k++) {
	    	  System.out.println("Student's name: " + studentsNames[k]); }
	      
	    //the second way to do
	     String[] Studentsname={"Bob","Tony","Hui"};
	     for (int l=0; l<Studentsname.length; l++) {
	    	 System.out.println("Student's name: " + Studentsname[l]);
	     }
	     
	      
	      }
	    
	    
}