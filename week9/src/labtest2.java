import java.util.*;
public class labtest2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        //System.out.println("Enter the number of students in your class: ");
	        //int number = input.nextInt();

	      //  System.out.println("Now enter the " + number + " students names");
	        String[] nameList = new String[3];
	        double[] salarylist = new double[3];
	        for (int i = 0; i < 3; i++) {
	        	System.out.print("Enter emloyee name: " );
	            nameList[i] = input.next();
	            input.nextLine();
	        	System.out.print("Enter emloyee salary: ");
	            salarylist[i] = input.nextInt();
	        }

	        for (int i = 0; i < 3; i++) {
	            System.out.println(nameList[i]+"'salary is "  + salarylist[i]);
	        }
	        
	        
	}
}


