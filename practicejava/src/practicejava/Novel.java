package practicejava;

public class Novel extends Book {

	public Novel(String Title, String Author, String type, double price) {
		super(Title, Author, type, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Buy Novel!");
	}


}
