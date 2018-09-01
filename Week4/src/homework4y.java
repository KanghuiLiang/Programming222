
import java.util.Scanner;



public class homework4y {


 public static void main(String[] args) {

  // TODO Auto-generated method stub

  Scanner console = new Scanner(System.in);

  double num1,num2;

  int choice;

  String printResult;

  //Enter first number

  System.out.print("Enter 1st number: ");

  num1 = console.nextDouble();

  //Enter second number

  System.out.print("Enter 2st number: ");

  num2 = console.nextDouble();

  

  System.out.println("-----------------------");

  //Enter user choice

  System.out.println("Enter 1 - " + num1 +" + " + num2 );

  System.out.println("Enter 2 - " + num1 +" - " + num2 

    + "\nEnter 3 - " + num1 +" x " + num2 

    + "\nEnter 4 - " + num1 +" / " + num2 );

  System.out.println("-----------------------");

  System.out.print("Please enter your choice: ");

  choice = console.nextInt();

  

  // getting the result

  printResult = "Result of " + num1 ;

  switch(choice)

  {

  case 1:

   printResult +=" + " + num2 + " = "+ (num1+num2);

  break;

  

  case 2:

   printResult +=" - " + num2 + " = "+ (num1-num2);

  break;

  case 3:

   printResult +=" * " + num2 + " = "+ (num1*num2);

  break;

  case 4:

   printResult +=" / " + num2 + " = "+ (num1/num2);

  break;

  default:

   printResult = "Error";

  break;

  }

  System.out.println(printResult);

  /*

  if (choice == 1)

  {

   printResult +=" + " + num2 + " = "+ (num1+num2);

  }

  else if (choice == 2)

  {

   printResult +=" - " + num2 + " = "+ (num1-num2);

  }

  else if (choice == 3)

  {

   printResult +=" * " + num2 + " = "+ (num1*num2);

  }

  else if (choice == 4)

  {

   printResult +=" / " + num2 + " = "+ (num1/num2);

  }

  else

  {

   printResult = "Error";

  }

  System.out.println(printResult);

  */

  

 }



}