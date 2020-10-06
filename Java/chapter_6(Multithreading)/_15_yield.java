class _15_yield extends Thread
{
	public void run()
	{
	try{
			for(int i=1;i<=5;i++)
			{
				System.out.println("thread: "+i);
				 Thread.sleep(100);
			}
			System.out.println("Exiting thread");
		}catch(Exception e){ }
	}

	public static void main(String[] args) 
	{
	try{
		_15_yield t1=new _15_yield();
		//t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		for(int i=1;i<=2;i++)
			{
				System.out.println("main: "+i);
				 Thread.sleep(500);
			}
			Thread.yield();
			System.out.println("Exiting Main");
		}catch(Exception e){ }
		
	}
}