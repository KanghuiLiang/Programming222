import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
            	System.out.print("Enter a word:");
                String s1=sc.next();
                System.out.print("Enter a integer:");
                int x=sc.nextInt();
                
        
                System.out.printf("%-15s%03d%n", s1, x);
                //"%-15s%03d%n" 
                //% used as a formatter
                //minus sign used for left indentation of the string.
                //15s the string's minimum field width 15
                //0 : pads the extra 0s in the integer
                //3d: the integer's minimum field width 3.
                //%n : print the new line
            }
           //How to print all the info here...????
            System.out.println("================================");

            /*
Explanation

Each String is left-justified with trailing whitespace 
through the first  characters. The leading digit of the integer 
is the  character, and each integer that was less than  digits now has leading zeroes.

*/
    }
}

