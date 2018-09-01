package week8;

import java.util.*;

public class class8_2_2 {
	// public static int hei; (can do like this)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter pyramid height: ");
		int hei = console.nextInt();
		console.nextLine();
		System.out.println("choose a symbol: ");
		String Sym = console.nextLine();
		createPyramid(hei, Sym);
	}

	public static void createPyramid(int hei, String Sym) {

		for (int i = 1; i <= hei; i++) {
			for (int j = hei; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(Sym);
				System.out.print(" ");
			}

			System.out.println();
		}

	}
}
