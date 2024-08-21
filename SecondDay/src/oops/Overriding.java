package oops;

public class Overriding 
{
	public static void main(String[] args) 
	{
		Shape s1 = new Shape();
		Shape s2 = new triangle();
		Shape s3 = new square();
		s1.area();
		s2.area();
		s3.area();
	}
}

class Shape
{
	public void area()
	{
		System.out.println("Shape Class ...");
	}
}

class triangle extends Shape 
{
	public void area()
	{
		System.out.println("Triangle Class ...");
	}
}

class square extends Shape
{
	public void area()
	{
		System.out.println("Square Class ...");
	}
}