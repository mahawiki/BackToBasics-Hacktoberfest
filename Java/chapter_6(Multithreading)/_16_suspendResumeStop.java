
class _16_suspendResumeStop extends Thread 	
{
	public void run()
	{
	try{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}catch(Exception e){System.out.println(e);}
		
	}

	public static void main(String args[])
	{
		_16_suspendResumeStop t1=new _16_suspendResumeStop();
		t1.start();
		
	try{ Thread.sleep(1000);
		System.out.println("thread is suspended");
		 t1.suspend();
		 Thread.sleep(1000);
		System.out.println("thread is resumed");
		 t1.resume();
		 Thread.sleep(1000);
		System.out.println("thread is stopped");
		 t1.stop();
		}catch(Exception e){}
	}
}
