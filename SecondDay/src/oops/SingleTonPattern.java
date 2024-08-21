package oops;

public class SingleTonPattern 
{
	public static void main(String[] args) 
	{
		single obj1 = new single();
		single obj2 = new single();
		
	}
	
}

class single
{
	private single instance;
	
	public single getInstance()
	{
		if(instance == null)
		{
			return new single();
		}
		
		return instance;
	}
}