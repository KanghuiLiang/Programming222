package week5;

public class FUNNEL {
	public static void main(String[] args) {

		  // TODO Auto-generated method stub

		  for(int i =1; i<=5;i++){

		   /*for (int j = 1 ; j<=5 ; j++){

		    System.out.print(j+" ");

		   }*/

		   for (int l =5 ;l >i ; l--){

		    System.out.print(" ");

		   }

		   for (int k =1; k<=i;k++){

		    System.out.print(i);

		    System.out.print(" ");

		   }

		   System.out.println(" layer no :"+i);

		  }

		  for(int i =5; i>=1;i--){

		   for (int j = 1 ; j<=5 ; j++){

		    System.out.print(j+" ");

		   }

		   for (int l =i ;l <5 ; l++){

		    System.out.print(" ");

		   }

		   for (int k =1; k<=i;k++){

		    System.out.print("*");

		    System.out.print(" ");

		   }
 
		   System.out.println(" layer no :"+i); 

		  }

	}
}
		

  	

	


