package week2classwork;

public class Food_receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double Chicken_Teriyaki=50;
	double Miso_Soup=30;
	double Subtotal=50+30;
	double Service_Charge=Subtotal*0.10;
	double Tax=Subtotal*0.07;
    double Total=Subtotal+Service_Charge+Tax;
	System.out.println("Japanese Food Receipt");
	System.out.print("Chicken Teriyaki:");
	System.out.println(Chicken_Teriyaki);
	
	System.out.print("Miso Soup:");
	System.out.println(Miso_Soup);
	
	System.out.print("Subtotal:");
	System.out.println(Subtotal);
	
	System.out.println("-----------------------");
	System.out.print("Service Charge:10%:");
	System.out.println(Service_Charge);
	
	System.out.print("Tax 7%:");
	System.out.println(Tax);
	System.out.print("Total:");
	System.out.println(Total);
	}
}
