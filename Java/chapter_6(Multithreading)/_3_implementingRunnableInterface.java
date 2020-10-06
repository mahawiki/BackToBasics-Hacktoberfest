
class _3_implementingRunnableInterface implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try{ Thread.sleep(1000);}catch(Exception e){ }
		}
	}

	public static void main(String[] args) 
	{
		Thread t1=new Thread(new _3_implementingRunnableInterface());
		t1.start();
	}
}

