package set2;

public class Book {
	String name, writer;
	double price;
	int year;

	public Book(String name, String writer, double price, int year) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + ", price=" + price + ", year=" + year + "]";
	}

}
