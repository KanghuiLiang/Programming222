package practicejava;

public class sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = new Book[2];
		book[0] = new Novel("Hui", "Sam", "Novel", 123);
		book[1] = new Fiction("SAM", "HUI","Fiction", 456);
		
		
		
//		
		Bookstore store = new Bookstore("Make", "It", book, 13);
		System.out.println(store);
		for (int i = 0; i<book.length; i++) {
			System.out.println(book[i]+"\n+++++");
		}
		
		Book b = new Fiction("Hui", "s", "a", 1000);
		b.buy();
		
//		Book[] a = {b};
//		for (int i = 0; i<a.length; i++) {
//			System.out.println(a[i]+"\n+++++");
//		}  another example of array
		
		Fiction c = new Fiction("Hui", "s", "a", 1000);
//		dotalk(c);   //!
		
		c.talkback();

	}

//	public static void dotalk(AI x) {x.talkback();} //!
}
