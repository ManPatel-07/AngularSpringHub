package abstractmethod;

public class Main 
{
	public static void main(String[] args) 
	{
		Parent s1 = new Son();
		Daughter d1 = new Daughter();
		
		s1.career();
		d1.career();
		
		abcd cd = new abcd();
		cd.data();
	}
}
