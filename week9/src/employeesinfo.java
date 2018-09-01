import java.util.*;
public class employeesinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner input=new Scanner(System.in);
	   
	   System.out.print("Enter emloyee name: " );
	   String name1 = input.nextLine();
	   System.out.print("Enter emloyee salary: " );
	   double Sa1 = input.nextDouble();
	   System.out.println("-------------------");
	   
	   input.nextLine();
	   System.out.print("Enter emloyee name: " );
	   String name2 = input.nextLine();
	   System.out.print("Enter emloyee salary: " );
	   double Sa2 = input.nextDouble();
	   System.out.println("-------------------");
	   
	   input.nextLine();
	   System.out.print("Enter emloyee name: " );
	   String name3 = input.nextLine();
	   System.out.print("Enter emloyee salary: " );
	   double Sa3 = input.nextDouble();
	   System.out.println("-------------------");
	   
	   input.nextLine();
	   System.out.println(name1+" salary is " + Sa1);
	   System.out.println(name2+" salary is " + Sa2);
	   System.out.println(name3+" salary is " + Sa3);
	   System.out.println("-------------------");
	   double aver= (Sa1+Sa2+Sa3)/3;
	   System.out.println("Average salary is "+ aver);
	   
	   String[]  namelist=new String[3];
	   double[]  salarylist=new double[2];
	    namelist[0]=name1;
	    salarylist[0]=Sa1;
	    namelist[1]=name2;
	    salarylist[1]=Sa2;
	    namelist[2]=name3;
	    salarylist[2]=Sa3;
	    
	  
	   
	   }
	}


