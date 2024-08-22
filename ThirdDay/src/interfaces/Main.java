package interfaces;

public class Main {

	public static void main(String[] args) 
	{
//		Car c1 = new Car();
//		Media m1 = new Car();
//		
//		c1.start();
//		m1.stop();
		
		NiceCar c3 = new NiceCar(new ElectricEngine());
		c3.start();
		c3.musicStop();
		
	}

}
