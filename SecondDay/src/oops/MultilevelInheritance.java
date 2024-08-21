package oops;

public class MultilevelInheritance 
{
	public static void main(String[] args)
	{
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Puppy a3 = new Puppy();
		a1.printData();
		a2.printData();
		a3.printData();
	}
}

class Animal
{
	void printData()
	{
		System.out.println("Animal Class..");
	}
}

class Dog extends Animal
{
	void printData()
	{
		System.out.println("Dog class ...");
	}
}

class Puppy extends Dog
{
	void printData()
	{
		System.out.println("Puppy Class ...");
	}
}