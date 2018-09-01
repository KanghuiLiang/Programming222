package practicejava;

public class Bookstore {
	String storeName;
	String Location;
     Book[] Book;
     int totalQuantity;
	
	public Bookstore(String storeName,String Location,Book[] Book, int totalQuantity) {
		this.storeName = storeName;
		this.Location = Location;
		this.Book=Book;
		this.totalQuantity = totalQuantity;
	}
	
	public String toString() {
//		String booklist="";
//		for(int i = 0; i<Book.length; i++) {
//			booklist += Book[i]+"\n+++++\n";
//		}
		return "Bookstore: "+ storeName +"\nLocation: "+Location+"\nBooklist: ";
	}
}
