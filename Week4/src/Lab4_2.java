import java.util.Scanner;
public class Lab4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner console =new Scanner(System.in);
    
    System.out.println("Type a number(1-5) to rate this program:");
    int rate=console.nextInt();
    
    String RateString="";
    switch(rate) {
    case 1: RateString = "Very bad";
    break;
    
    case 2: RateString ="Bad";
    break;
    
    case 3: RateString ="Normal";
    break;
    
    case 4: RateString ="Good";
    break; 
    
    case 5: RateString ="Very Good";
    break;
    
    default: RateString = "Invalid Rate";
    break;
   }
    System.out.println(RateString);
	}

}
