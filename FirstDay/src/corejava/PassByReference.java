package corejava;

public class PassByReference 
{
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		
		System.out.println("Before Calling the Change ...");
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		Change(arr);
		
		System.out.println("After calling the change ..");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}
	
	private static void Change(int x[])
	{
		x[0] = 1000;
	}
}
