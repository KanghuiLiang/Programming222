package practicejava;

import java.util.Scanner;

public class counttt {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
			
			
			System.out.println("Let's play a game!"
					+ "\nGuess a number!");
			int a = (int)(Math.random()*10); //if in here, only need to guess the exact one 
			int num;
			boolean ok = false;
			//dowhile loop is to make it run many times until it is correct

	    	Scanner math = new Scanner(System.in);
		    do {
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
		    
		    else {
		    
				System.out.println("Congratulations!");
				ok = true;
			}
		    }
		  
		   while (ok = false); {
			System.out.println("do you want to play agian?type\"y\"to continue?"); 
			String runagainCheck = math.next();
			if (runagainCheck.equalsIgnoreCase("y"))
			    ok = false;
			else 
				System.out.println("Bye bye");
		    }

		

	}

}
