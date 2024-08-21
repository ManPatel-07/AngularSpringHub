package oops;

public class HierarchicalInheritance
{
	public static void main(String[] args) 
	{
		Cars b1 = new Maruti();
		Cars b2 = new BMW();
	}
}

class Cars
{	
	Cars()
	{
		System.out.println("Cars Class ...");
	}
}

class BMW extends Cars
{
	BMW()
	{
		System.out.println("BMW class ...");
	}
}

class Maruti extends Cars
{
	Maruti()
	{
		System.out.println("Maruti class ...");
	}
}