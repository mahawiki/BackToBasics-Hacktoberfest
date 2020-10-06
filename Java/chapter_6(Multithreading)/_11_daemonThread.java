
class _11_daemonThread extends Thread 	// + isDaemon () , setDaemon()
{
	public void run()
	{
		 System.out.println("task1 completed... isDaemon()"+Thread.currentThread().isDaemon());
	}

	public static void main(String args[])
	{
		_11_daemonThread t1=new _11_daemonThread();
		_11_daemonThread t2=new _11_daemonThread();
		_11_daemonThread t3=new _11_daemonThread();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}