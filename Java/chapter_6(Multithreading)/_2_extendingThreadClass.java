
class _2_extendingThreadClass extends Thread  
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
		_2_extendingThreadClass t1=new _2_extendingThreadClass();
		t1.start();
	}

}