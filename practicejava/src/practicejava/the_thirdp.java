package practicejava;

import java.util.*;

public class the_thirdp {    
	public static void main(String[] args) {


            Scanner console=new Scanner(System.in);
               
            System.out.println("enter a number");
            int n=console.nextInt();
          
            if(n/2==0 && n!=1 && !(n<=0||n>3 && n<5)){//1 and 4
            	
             System.out.println("Not weird");}
                
           else if(n/2==0 && !(n<=0) || n>=6 && n<= 20) {//6 8 10 12 14 16 18 20 
                System.out.println("Weird");
                }
           else if (n/2 == 0 && (n<=0)|| n==2 || n>20 && n<=100) {//2 and 22...100
            System.out.println("Not weird");
           }
           else if (n<=0 || n>100){ // because 1<=n<=100 constraint
        	   System.out.println("Invalid number!");
           }else {// all odds
        	   System.out.println("Weird");
           }
    }
	
}

