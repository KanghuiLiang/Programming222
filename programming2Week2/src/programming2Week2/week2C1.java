package programming2Week2;

public class week2C1 {

	public static void main(String[]
			args) {

			String attack_string = Attack("slash","head");
			System.out.println("Attack with "+
			attack_string);
			String attack2_string =
			Attack("bow", "eye");
			System.out.println("Attack with "+
			attack2_string);
}

	public static String Attack(String s1, String s2) {
		return  s1+" in the " +s2;
	}
		
}