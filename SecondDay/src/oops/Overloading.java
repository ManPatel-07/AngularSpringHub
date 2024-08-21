package oops;

public class Overloading {

	public static void main(String[] args) 
	{
//		CompileTime PolyMorphism
		Sum s1 = new Sum();
		Sum s2 = new Sum(1, 2);
		Sum s3 = new Sum(3, 4, 5);
	}

}

class Sum
{
	public Sum ()
	{
		System.out.println("Default constructor ...");
	}
	
	public Sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public Sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
