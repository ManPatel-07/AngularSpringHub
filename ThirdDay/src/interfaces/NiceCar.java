package interfaces;

public class NiceCar 
{
	private Engine engine;
	private Media player = new MediaImpl();
	
	public NiceCar(Engine engine) {
		super();
		this.engine = engine;
	}
	
	public NiceCar()
	{
		this.engine = new PowerEngine();
	}
	
	public void start()
	{
		engine.start();
	}
	
	public void stop()
	{
		engine.stop();
	}
	
	public void acc()
	{
		engine.acc();
	}
	
	public void musicStart()
	{
		player.start();
	}
	
	public void musicStop()
	{
		player.stop();
	}
}
