package set2;

public class Exercise28 {

	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.println("Enter Book's name : ");
		String name = h.scan.next();
		System.out.println("Enter Book's writer : ");
		String writer = h.scan.next();
		System.out.println("Enter Book's price : ");
		double price = h.getPosDouble();
		System.out.println("Enter Book's year of publishing : ");
		int year = h.getPosInt();

		Book book = new Book(name, writer, price, year);
		System.out.println(book);

//		Book rc = new Book("Robinson Crusoe", "Daniel Defoe", 15.50, 1719);
//		Book hod = new Book("Heart of Darkness", "Joseph Conrad", 12.80, 1902);
//		Book bm = new Book("Beach Music", "Pat Conroy", 9.50, 1996);
//		System.out.println(rc);
//		System.out.println(hod);
//		System.out.println(bm);
	}
}
