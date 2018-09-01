import java.util.*;
public class dowhile_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //do/while loop: performs its test at the end of each repetition
    // Guarantees that the loop's{} body will run at least once.
	// do {
		//statement(s);
		//} while (test);
		// example: prompt until correct password is typed.
		String phrase;
		//Scanner console=new Scanner(System.in);
		do {
			Scanner console=new Scanner(System.in);
			System.out.print("Type your password:");
			phrase = console.next();
		} while (!phrase.equals("abracadabra"));
		
	

    Scanner nie=new Scanner(System.in);
	String choose =nie.nextLine();
	do {
	//Scanner nie=new Scanner(System.in);
	System.out.println("Type item you want: ");
	choose = nie.nextLine();
	}
	while (!choose.equals("N"));

	System.out.println(choose);
	}
}
