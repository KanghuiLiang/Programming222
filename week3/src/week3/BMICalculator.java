package week3;
import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variable
		Scanner console =new Scanner(System.in);
		double height;
		double weight;
		double bmi;
		//compute BMI
		System.out.print("Enter the height(meter):");
		height =console.nextDouble();
		
		System.out.print("Enter the weight(kg):");
		weight =console.nextDouble();
		
		/*height =1.75;//meter
		weight =65;//kg*/
		bmi=weight/(height*height);
		
	   System.out.print("Current BMI:");
	   System.out.println(bmi);
		
	   

	}

}
