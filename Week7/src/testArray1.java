import java.util.*;
public class testArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] multispell = Attack("Fireball", 5); 
		for (int i = 0; i <multispell.length; i++ ) {
			System.out.println(multispell[i]);
		}
		
				
	}
	
	public static String[] Attack(String s,int num) {
		String[] attack = new String[num];
		for (int i = 0; i <num; i++ ) {
			attack[i]=("Cast "+ s+" !!!");
		}
		
		return attack;
		
	}

}
