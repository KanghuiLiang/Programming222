package week3;
import java.util.Scanner;
public class week3homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner console=new Scanner(System.in); 
         System.out.println("Press Enter to start to save your students' grade");
         double grade1,grade2,grade3;
        
        
         System.out.print("Enter the grade of A's Attendance(10%):");
         grade1=console.nextDouble();
         
         System.out.print("Enter the grade of A's Assignment(20%): ");
         grade1+=console.nextDouble();
         
         System.out.print("Enter the grade of A's Quiz(10%):");
         grade1+=console.nextDouble();
         
         System.out.print("Enter the grade of A's Mideterm(30%)");
         grade1+=console.nextDouble();
         
         System.out.print("Enter the grade of A's Final(30%)");
         grade1+=console.nextDouble();
         
        
         
         
         System.out.print("Enter the grade of B's Attendance:");
         double attendanceb=console.nextDouble();
         
         System.out.print("Enter the grade of B's Assignment: ");
         double assignmentb=console.nextDouble();
         
         System.out.print("Enter the grade of B's Quiz");
         double quizb=console.nextDouble();
         
         System.out.print("Enter the grade of B's Mideterm");
         double midtermb=console.nextDouble();
         
         System.out.print("Enter the grade of B's Final");
         double Finalb=console.nextDouble();
         
         
         
         
         
         System.out.print("Enter the grade of C's Attendance:");
         double attendancec=console.nextDouble();
         
         System.out.print("Enter the grade of C's Assignment: ");
         double assignmentc=console.nextDouble();
         
         System.out.print("Enter the grade of C's Quiz");
         double quizc=console.nextDouble();
         
         System.out.print("Enter the grade of C's Mideterm");
         double midtermc=console.nextDouble();
         
         System.out.print("Enter the grade of C's Final");
         double Finalc=console.nextDouble();
         
         double Ga=(grade1)/5;//Ga is the grade of A.
         double Gb=(attendanceb+assignmentb+quizb+midtermb+Finalb)/5;//Gb is the grade of B.
         double Gc=(attendancec+assignmentc+quizc+midtermc+Finalc)/5;//Gc is the grade of C.
         double average=(Ga+Gb+Gc)/3; //average is the class's average.
         
         System.out.println("A's grade is "+Ga+".");
         System.out.println("B's grade is "+Gb+".");
         System.out.println("C's grade is"+Gc+".");
         System.out.println("The average of class is "+average+".");
         
         
         
         
        	 
         
	}

}
