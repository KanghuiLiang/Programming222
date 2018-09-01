package week8;
import java.util.*;

public class week8classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Enter number(s) of student:");
		int amount =console.nextInt();
		console.nextLine();
		String[] namelist= new String [amount]; //???
		
		for(int i = 0; i <namelist.length; i++){
			System.out.println("your "+ (i+1) +" student's name:");
			namelist[i] = console.next(); //What is the problem?
		}
		
		System.out.println(Arrays.toString(namelist));
		// for (int i=0; i<namelist.length; i++)
        for (int j= 0; j<amount;j++) {
        	System.out.println(namelist[j]);
        }
	}

}
// System.out.println(getnumber(20));
//public static String getnumber(int number){
//number*=2;
//return "Your number is" + number;
