package week8;
import java.util.*;
public class lab8_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=num.nextInt();
		getnumber(number);
    
	}
	public static String getnumber(int number){
	
	number*=2;
	return "Your number is" + number;
	}
}
            //?????