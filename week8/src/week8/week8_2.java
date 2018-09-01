package week8;
import java.util.*;
public class week8_2 {
	//private 
	//static 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String [] printoutinfo = {"First Name: ", "Last Name: ", "Phone Number: ", "Email Address: ", "Home Address: "};
		printinfo(printoutinfo,createHuiInfo(printoutinfo));
		

	}
	public static String[] createHuiInfo(String[] printoutinfo) {
		String [] huisinfo = new String [5];
		Scanner hui = new Scanner(System.in);
		// TODO Auto-generated method stub
		//hui = new Scanner (System.in);
		
		System.out.println ("Student's Information..");
		
		for (int i=0; i<huisinfo.length; i++){
		System.out.print(printoutinfo[i]);
		huisinfo[i] = hui.nextLine();
		}
		
		
		
		
		return huisinfo;
	}
	
	private static void printinfo(String[] printoutinfo, String[] huisinfo ){
		System.out.println("\nStudent's Information");
		for (int i = 0; i<printoutinfo.length; i++){
		System.out.println(printoutinfo[i]+huisinfo[i]);
		//System.out.println(huisinfo[i]);
		}
		
		
	}
	

}
