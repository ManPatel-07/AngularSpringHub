package interfaces;

public class Car implements Engine, Media
{

	@Override
	public void start() 
	{
		System.out.println("Normal Car Engine is Start");
	}

	@Override
	public void stop() {
		System.out.println("Normal Car Engine is Stop");
	}

	@Override
	public void acc()
	{
		System.out.println("Normal Car Engine is Accelerate");
	}

}
