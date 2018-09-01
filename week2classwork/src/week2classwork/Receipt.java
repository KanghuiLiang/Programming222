package week2classwork;

public class Receipt {

	public static void main(String[] args) {
		//Calculate total owed, assuming 8% tax /15% tip
		double subtotal=38+40+30;
		double tax_receipt=(subtotal*.08);
		double tip=(subtotal*.15);
		System.out.print("subtotal:");
		System.out.println(subtotal);
		
		System.out.print("Tax:");
		System.out.println(tax_receipt);
		
		System.out.print("Tip:");
		System.out.println(tip);
		
		System.out.print("Total:");
		System.out.println(subtotal+tax_receipt+tip);
	}

}
