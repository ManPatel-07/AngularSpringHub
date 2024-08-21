package corejava;

public class PassByValue 
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		
		System.out.println("Before calling Change function a = " + a +" b = " + b);
		
		Change(a,b);
		
		System.out.println("After calling Change function a = " + a +" b = " + b);
		
	}
	private static void Change(int a, int b)
	{
		a = 100;
		b = 200;
	}
}
