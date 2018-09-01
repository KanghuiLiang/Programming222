package week8;
import java.util.*;
public class homework_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner console = new Scanner(System.in);
    String[] myFav=new String[5];
    System.out.println("List 5 things you like!");
    int i;
    for (i=0; i<5; i++) {
       System.out.print((i+1) +" : ");
       myFav[i] = console.nextLine();
      }
    for (i=0; i<5; i++){
    System.out.print(myFav[i]+ " "); // have to use another for loop to print
	}
	}

}
