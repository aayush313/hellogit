import java.applet.Applet;
public class MyApplet extends Applet
{ 
	public void init()
	{
		System.out.println("init method is Invoked!!");		
	}
	 public void start()
	{
		System.out.println("start method is Invoked!!");		
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Applet",100,100);		
	}
	public void stop()
	{
		System.out.println("stop method is Invoked!!");		
	}
	public void destroy()
	{
		System.out.println("destroy method is Invoked!!");		
	}	
}
