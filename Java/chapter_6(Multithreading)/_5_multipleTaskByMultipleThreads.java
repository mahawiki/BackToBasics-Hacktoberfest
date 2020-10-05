
class Demo1  extends Thread
{
	public void run()
	{
	try{
			 for(int i=1;i<=5;i++)
			 {
			 	System.out.println(Thread.currentThread().getName()+" : "+i);
			 	Thread.sleep(1000);
			 }
		}catch(Exception e){}
	}
}

class Demo2  extends Thread
{
	public void run()
	{
	try{
			 for(int i=5;i>=1;i--)
			 {
			 	System.out.println(Thread.currentThread().getName()+" : "+i);
			 	Thread.sleep(1000);
			 }
		}catch(Exception e){}
	}
}

class _5_multipleTaskByMultipleThreads
{
	public static void main(String[] args) 
	{
		Demo1 t1=new Demo1();
		Demo2 t2=new Demo2();
		t1.start();
		t2.start();	
	}
}