class _10_priority implements Runnable
{
	public void run()
	{
		System.out.println("thread started.... of priority :"+Thread.currentThread()+" "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		Thread t1= new Thread(new _10_priority());
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		System.out.println("thread started.... of priority :"+Thread.currentThread()+" "+Thread.currentThread().getPriority());
	}

}