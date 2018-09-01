import java.util.Scanner;
public class lab4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in); 
        System.out.println("Press Enter to start to save your students' grade");
        double grade1,grade2,grade3;
        
        System.out.println("Now save A's grade.");
        
     
         
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
        
        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(grade3);
        
       if (grade1>=90 && grade1<=100){
    	   System.out.println("A's grade is A");}
       else if(grade1>=80 && grade1<=89){
    	   System.out.println("A's grade is B");
       }
       else if(grade1>=70 && grade1<=79){
    	   System.out.println("A's grade is C");}
       else if(grade1>=60 && grade1<=69){
    	   System.out.println("A's grade is D");}
       else if(grade1>=0 && grade1<=59){
    	   System.out.println("A's grade is F");
       }
       
       
       if (grade2>=90 && grade2<=100){
    	   System.out.println("B's grade is A");}
       else if(grade2>=80 && grade2<=89){
    	   System.out.println("B's grade is B");
       }
       else if(grade2>=70 && grade2<=79){
    	   System.out.println("B's grade is C");}
       else if(grade2>=60 && grade2<=69){
    	   System.out.println("B's grade is D");}
       else if(grade2>=0 &&grade2<=59){
    	   System.out.println("B's grade is F");
       
	}
       
       if (grade3>=90 && grade3<=100){
    	   System.out.println("C's grade is A");}
       else if(grade3>=80 && grade3<=89){
    	   System.out.println("C's grade isB");
       }
       else if(grade3>=70 && grade3<=79){
    	   System.out.println("C's grade is C");}
       else if(grade3>=60 && grade3<=69){
    	   System.out.println("C's grade is D");}
       else if(grade3>=0 && grade3<=59){
    	   System.out.println("C's grade is F");}
    	  
    	   }
}

