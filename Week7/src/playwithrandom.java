import java.util.*;
public class playwithrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	System.out.println("Let's play a game!"
			+ "\nGuess a number!");
	int a = (int)(Math.random()*100); //if in here, only need to guess the exact one 
	int num;
	//boolean ok = false;
	//dowhile loop is to make it run many times until it is correct
    do {
    	Scanner math = new Scanner(System.in);
    	//int a = (int)(Math.random()*100);  // if in here, every time the number is different, it is hard to get the answer
    	System.out.println("Type a number to start to play");
        num = math.nextInt();
    	
	if (num<a) {
		System.out.println("You number is too low");
	}
	
	else if(num >a) {     //if you use else here, they will print it is too high when you get the correct answer. 
		                   //can use else if at the end of if statement if you need to have two tests 
		System.out.println("Your number is too high");
 	}
    }
	while (num!= a); { // use else
    
		System.out.println("Congratulations!");
		//ok = true;
	}
  
   //while (ok= false);
	//do you want to play agian? 
	//string runagainCheak 
	//=y
    }

}
