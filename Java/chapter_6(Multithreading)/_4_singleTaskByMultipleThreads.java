
class _4_singleTaskByMultipleThreads extends Thread
{
	public void run()
	{
	try{
		 for(int i=1;i<=5;i++)
		 {
		 	System.out.println(i);
		 	Thread.sleep(1000);
		 }
		}catch(Exception e){}
	}

	public static void main(String[] args) 
	{
		_4_singleTaskByMultipleThreads t1=new _4_singleTaskByMultipleThreads();
		_4_singleTaskByMultipleThreads t2=new _4_singleTaskByMultipleThreads();
		t1.start();
		t2.start();	
	}
}