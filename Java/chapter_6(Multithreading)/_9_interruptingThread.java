
class _9_interruptingThread extends Thread 	// + isInterrupted () , interrupted()
{
	public void run()
	{
	try{
		 //Thread.sleep(1000);  //if sleep statement is not present thread will complete the task will not be interrupted
		 System.out.println("task1");
		System.out.println("task2");
		System.out.println(Thread.interrupted());
		}catch(Exception e){System.out.println(e);}
	}

	public static void main(String args[])
	{
		_9_interruptingThread t1=new _9_interruptingThread();
		t1.start();
		
	try{ t1.interrupt();
		 System.out.println("in main "+t1.isInterrupted());
		}catch(Exception e){}
	}
}

//  o/p : java.lang.InterruptedException: sleep interrupted       
//        task1