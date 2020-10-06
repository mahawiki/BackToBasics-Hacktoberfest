class _14_isAliveJoin extends Thread
{
	public void run()
	{
	try{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				 Thread.sleep(1000);
			}
		}catch(Exception e){ }
	}

	public static void main(String[] args) 
	{
	try{
		_14_join t1=new _14_join();
		t1.start();
		System.out.println("thread: "+t1.isAlive());
		t1.join();
		System.out.println("thread: "+t1.isAlive());
		System.out.println("exiting main..");
		}catch(Exception e){ }
		
	}
}