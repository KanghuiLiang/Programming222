package week8;
import java.util.*;
public class lab8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("Define the layer:");
		int layers=console.nextInt();
		createpyramaid(layers);
		 
	    Scanner consoleb=new Scanner(System.in);
		System.out.println("Enter a character to make a funnel:");
		String b=console.nextLine();
		createfunnel(layers,b);
		 
	}
		 

	
	public static void  createpyramaid(int layers){
		
		 
		
		for(int i=1; i<=layers;i++){

		  

		   for (int l =layers ;l >i ; l--){

		    System.out.print(" ");

		   }

		   for (int k =1; k<=i;k++){

		    System.out.print("*");

		    System.out.print(" ");

		   }

		   System.out.println(i);


		  }

	   }
	
	
	public static void createfunnel(int layers,String b){
		
		
		for(int i =layers; i>=1;i--){

			   for (int l =i ;l <layers ; l++){

			    System.out.print(" ");

			   }

			   for (int k =1; k<=i;k++){

			    System.out.print(b);

			    System.out.print(" ");

			   }

			   System.out.println(i);

			  }
	}
		   

}
