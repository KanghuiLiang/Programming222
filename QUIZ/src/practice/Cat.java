package practice;

public class Cat extends Doll{

	public Cat(int s, int w, int h, String t, double p) {
		super(s, w, h, t, p);
	}
	
	public void talk(String sentence) {
		System.out.println("Ok");

	}

	public void walk(int distance) {}
}
