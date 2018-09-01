package week9;

public class P2Week1part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			 Find_odd(1,5);
			 Find_odd(5,10);
			 Runchar('*',5);
			 Runchar('^',3);
			}
	}

	public static void Find_odd(int odd, int odd2) {
		String all ="";
		for (int i =odd; i <odd2-1; i++) {
			if (i%2==1) {
				all += i + ",";
			}
			
		  }
		for (int j=(odd2-1); j<=odd2; j++) {
			if (j%2==1) {
				all += j;
			}
		}
		
		System.out.println(all);
	
	}
	public static void Runchar(char sym, int num) {
		for (int i=1; i<=num; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(sym);
			}
			System.out.println();
		}
		
	
	}
	

}
