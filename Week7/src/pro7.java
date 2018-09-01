	import java.util.*;
public class pro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner console= new Scanner(System.in);
				System.out.println("Please enter your number to modify");
				int number=0;
				do{
					System.out.print("Enter your number:");
					number=console.nextInt();
					if(number %2==0){
						System.out.println("Even");}
					else 
					{System.out.println("Odd");}
				}
				while(number !=-1);
				System.out.println("Done!!");
				int[] numbers = new int[10];
				
				for (int i = 0; i < numbers.length; i++) {
				    numbers[i] = 2 * i;
				     System.out.println(numbers[i]);
				 }
				 System.out.println(Arrays.toString(numbers));
			}
					
				}


	
