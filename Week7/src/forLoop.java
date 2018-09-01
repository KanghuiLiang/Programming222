import java.util.*;
public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = console.nextInt();
    for (int i = 0; i <=num; i+=2) {
    	System.out.println(i);  // it will print the even numbers
        }
    
    System.out.println("+++++++++++");
    for (int i = 0; i<=num; i++) {
    	if (i%2==0)
    		System.out.println(i); //it will print the same as above
    	}
	}
}
