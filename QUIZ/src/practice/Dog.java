package practice;

public class Dog extends Doll {

	public Dog(int s, int w, int h, String t, double p) {
		super(s, w, h, t, p);
	}
	public void talk(String sentence) {
		System.out.println("HEY");
	}
    
	
	public void walk(int distance) {}
	
//	public String toString() {
//		return super.toString();
//	}

}
