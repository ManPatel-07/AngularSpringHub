package interfaces;

public class PowerEngine implements Engine {

	@Override
	public void start() 
	{
		System.out.println("Power Engine is start ...");
	}

	@Override
	public void stop() 
	{
		System.out.println("Power Engine is stop ...");
	}

	@Override
	public void acc() 
	{
		System.out.println("Power Engine is accelerate ...");
	}

}
