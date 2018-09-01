package practice;

public class Robot extends Doll implements talkback {

	public Robot(int s, int w, int h, String t, double p) {
		super(s, w, h, t, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void talk(String sentence) {
		// TODO Auto-generated method stub
		System.out.println("BOOP");

	}

	@Override
	void walk(int distance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void talkBack(String text) {
		// TODO Auto-generated method stub
		
	}

}
