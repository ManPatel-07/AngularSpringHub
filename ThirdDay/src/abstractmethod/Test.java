package abstractmethod;

public class Test 
{
	public static void main(String[] args) {
		uiu u = new uiu();
		u.printData();
		
		def a = new def();
//		a.printAbstractData();
		abcd ee = new abcd();
		ee.data();
	}
}

// this all not allow from the other packages

class abcd
{
	void data()
	{
		System.out.println("Default class ...");
	}
}

//private class xyz{
//	
//}

final class uiu
{
	void printData()
	{
		System.out.println("Final class ..");
	}
}

abstract class abc{
	void printAbstractData()
	{
		System.out.println("Abstract class ...");
	}
}

final class def extends abc
{
	
}

