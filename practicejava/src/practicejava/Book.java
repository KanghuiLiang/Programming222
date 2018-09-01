package practicejava;

abstract class Book {
	protected String Title;
	protected String Author;
	protected String type;
	protected double price;
	
	private String t;
	public Book (String Title, String Author,String type, double price) {
		this.Title = Title;
		this.Author = Author;
		this.type = type;
		this.price = price;
	}
	


	public String toString() {
		
		return "Title: " +Title
				+"\nAuthor: "+Author
				+"\nType: "+type
				+"\nPrice: "+price;
	}
	
	public abstract void buy();



	public String getT() {
		return t;
	}



	public void setT(String t) {
		this.t = t;
	}
	
	
	

}
