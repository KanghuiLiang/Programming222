import java.util.*;
public class type_char {
	Scanner console= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//type char
	//It is legal to have variables,parameters,returns of type char
    char letter ='p';
    System.out.println(letter);
    System.out.println(letter + "Hui");
    
    //The charAt method
    //The char in a string can be accessed using the charAt method
    //Accepts an int index parameter and returns the char at the index
    
    String food="cookie";
    char firstLetter=food.charAt(0);//'c'
    
    System.out.println(firstLetter + " is for " + food);
    
    //Comparing char values
    //you can compare char with ==, !=, and other operators
    Scanner console= new Scanner(System.in);
    console.nextLine();
   // System.out.print("Enter a letter:");
    // String word = console.next();
    //char last = word.charAt(word.length() - 1);
    
    
   /* while(! word.equals("s")) //if test is string,need to use (! word.equals(""))
    	                      //if test is number,use (word != 3)
        {
    	System.out.print("Enter a letter:");
        word = console.next();
      //while loop
        
        //char last = word.charAt(word.length() - 1); 
        
        }
   // while (word != "s");
    
    	System.out.println(word +" is plural.");
    
  /*  else {
    	System.out.println("You are wrong."); 
    	}*/
    	System.out.print("Enter a word");
    	String word1 = console.next();
    	char last = word1.charAt(word1.length() - 1); //wordlength= 4, 
    	//word.charAt(3)=t
    	if (last == 's') {
    	   System.out.println(word1 + " is plural.");
    	}
    	
    	//char VS int
    	// Each char is mapped to an integer value internally called an ASCII value
    	// 'A' = 65 'B' = 66 
    	//mixing char and int causes automatic conversion to int
    	//'a' + 10  is 107
    	//to convert an int into the equivalent char, type-cast it
    	//(char) ('a'+2) is 'c'
    	
    	
    	//char VS String
    	//"h" is a String, but 'h' is a char (they are difference)
    	//A String is an object, it contains methods
    	String s ="h";
    	s=s.toUpperCase(); //H
    	int len=s.length();//1
    	char first=s.charAt(0);//'H'
    	System.out.println(s+len+first);
    	
    	//A char is primitive,you can't call methods on it
    	//char c='h';
    	//c =c.toUpperCase(); //Error
    	//s =s.charAt(0).toUpperCase(); //Error
    	
    	//A format can contain placeholders to insert parameters
    	// %d integer
    	// %f real number
    	//%s String
    	
    	int x=3;
    	int y=-17;
    	System.out.printf("x is %d and y is %d! \n", x,y); // x is 3 and y is -17!
    	//printf does not drop to the next line unless you write \n
    	
    	
    	}
    
    
	}


