import java.util.*;
public class Lab7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // int[] numbers= new int[3];
    		//  System.out.println(numbers.length);
    		 
		Scanner console = new Scanner(System.in);
		
		System.out.println("Type the amount of the numbers you want: ");
		int Am=console.nextInt();
		int[] number = new int[Am];
		
		for(int i=0; i<Am; i++) {
			System.out.print("Type whatever number you like: ");
			 number[i]=console.nextInt();
		}			
	    
     // int[] number={5,2,3,4,1};
      Arrays.sort(number);
      
      System.out.println(Arrays.toString(number));
      
      int total =0;
      for (int i= 0; i<number.length; i++) {
    	
    			 total+=number[i];
      }
      
        int  ave= total/number.length;
      
      System.out.println("The Min: " + number[0]);
      System.out.println("The Max: " + number[(number.length-1)]);
      System.out.println("The ave: " + ave );

      
      
	}

}
