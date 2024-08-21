package oops;

public class Inheritance
{
	public static void main(String[] args)
	{
		Book b1 = new Book(1, 2, 3);
		BookWeight b2 = new BookWeight(11, 22, 33, 10);
		Book b3 = new BookWeight(44, 33, 55, 20);
//		with the parent class we not access the child class method
		System.out.println(b2.weight);
		System.out.println(b2.l);
	}
}

class Book
{
	public int l;
	private int h;
	private int w;
	
	public Book(int l, int h, int w) {
		super();
		this.l = l;
		this.h = h;
		this.w = w;
	}
}

class BookWeight extends Book
{
	int weight;

	public BookWeight(int l, int h, int w, int weight) {
		super(l, h, w);
		this.weight = weight;
	}

}
