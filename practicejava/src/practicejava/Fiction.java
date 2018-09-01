package practicejava;

public class Fiction extends Book implements AI{

	public Fiction(String Title, String Author, String type, double price) {
		super(Title, Author, type, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Buy fiction");
		
	}

	@Override
	public void talkback() {
System.out.println("talkkk");		
	}

}
