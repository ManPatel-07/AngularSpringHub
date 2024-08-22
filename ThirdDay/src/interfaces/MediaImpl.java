package interfaces;

public class MediaImpl implements Media 
{

	@Override
	public void start() 
	{
		System.out.println("Music play ...");
	}

	@Override
	public void stop() 
	{
		System.out.println("Music Stop ...");
	}

}
