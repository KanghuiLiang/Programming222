import java.util.*;
public class week1Classwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int input =10;

		   int num = 1;

		    String odd =" ";

		    String even = " ";

		    int Ocount = 0;

		    int Ecount = 0;

		 while (num<=input) {

		    	if (num%2==0) {

		    		even += num +",";

		   		Ecount++;

		 	}



		   	else {

		  		odd += num + ",";

		  		Ocount++;

		    	

		    }

		    	num=num+1;

		    }

		    	

		    System.out.println("Odd:"+odd);

		    System.out.println("Even:"+even);

		    System.out.println("Odd count:"+Ocount);

		    System.out.println("Even Count:"+ Ecount);



		    

		    

		 




	}

}
