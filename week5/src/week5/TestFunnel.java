package week5;

public class TestFunnel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for (int i=1;i<=5;i++) {
    	  for(int j=5; j>=i;j--) {
    		  System.out.print(" ");
    	  }
    	
    		  for(int j=1; j<=i;j++) {
    		  System.out.print("*");
    		  System.out.print(" ");  
    		  }
    	
    	 System.out.println();
      }
      System.out.println("--------------");
      
      for(int a=5; a>=1; a--) {
    	  for(int b=1; b<=a; b++) {
    		  System.out.print(" ");
    	  }
    	  
    	  for(int c=1; c<=a; c++) {
    		  System.out.print("*");
    		  System.out.print(" ");
    	  }
      System.out.println();	  
      }
      
      System.out.println("--------------");
      

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
 
      }
	}
	

}
