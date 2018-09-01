package week3;
import java.util.Scanner;
public class tryi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				// TODO Auto-generated method stub
		         Scanner console=new Scanner(System.in); 
		         System.out.println("Press Enter to start to save your students' grade");
		         double grade1,grade2,grade3;
		         
		         System.out.println("Now save A's grade.");
		         
		         console.nextLine();
		          
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
		         
		         System.out.println("Now save B's grade.");
		         
		         console.nextLine();
		         console.nextLine();
		       
		         
		         System.out.print("Enter the grade of B's Attendance(10%):");
		         grade2=console.nextDouble();
		        
		    
		         System.out.print("Enter the grade of B's Assignment(20%): ");
		         grade2+=console.nextDouble();
		         
		         System.out.print("Enter the grade of B's Quiz(10%):");
		         grade2+=console.nextDouble();
		         
		         System.out.print("Enter the grade of B's Mideterm(30%)");
		         grade2+=console.nextDouble();
		         
		         System.out.print("Enter the grade of B's Final(30%)");
		         grade2+=console.nextDouble();
		         
		         System.out.println("Now save C's grade.");
		         console.nextLine();
		         console.nextLine();
		         
		         System.out.print("Enter the grade of C's Attendance(10%):");
		         grade3=console.nextDouble();
		        
		        
		         System.out.print("Enter the grade of C's Assignment(20%): ");
		         grade3+=console.nextDouble();
		         
		         System.out.print("Enter the grade of C's Quiz(10%):");
		         grade3+=console.nextDouble();
		         
		         System.out.print("Enter the grade of C's Mideterm(30%)");
		         grade3+=console.nextDouble();
		         
		         System.out.print("Enter the grade of C's Final(30%)");
		         grade3+=console.nextDouble();
		         
		         double average=(grade1+grade2+grade3)/3;
		         
		         
		         System.out.println(grade1);
		         System.out.println(grade2);
		         System.out.println(grade3);
		         System.out.println(average);

	}

}
