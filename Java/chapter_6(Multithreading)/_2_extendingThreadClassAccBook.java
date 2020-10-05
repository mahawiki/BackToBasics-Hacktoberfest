class NewThread extends Thread 
{
	NewThread() 
	{
	super("demo thread");
	System.out.println("child thread: " + this);
	start(); 
	}

	public void run() 
	{
	try {
		for(int i = 5; i > 0; i--) 
		{
			System.out.println("child thread: " + i);
			Thread.sleep(500);
		}
		} 
		catch (InterruptedException e) {}
	System.out.println("exiting child thread.");
	}
}

class _2_extendingThreadClassAccBook
{
	public static void main(String args[]) 
	{
		new NewThread(); // create a new thread
	}
}
