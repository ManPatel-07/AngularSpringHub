package corejava;

public class Coversion {

	public static void main(String[] args) 
	{
		//Narrowing Conversion (AutoMatic)
		byte b1 = 1;
		byte b2 = 2;
		int i1 = b1;
		
		System.out.println("Integer value is :- " + i1);
		
		//wideing Coversion (Manually)
		int i2 = 2;
		byte b3 = (byte) i2;
		
		System.out.println("byte value is :- "+ b3);
		
		//Example of Coversion
		byte x = 10;
		byte y = 10;
		
		
		//By default in java Byte short and char value store as a integer
		byte add = (byte) (x + y);
		
		System.out.println("addition of 2 bytes number :- " + add);
	}

}
