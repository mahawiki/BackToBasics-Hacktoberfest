// A correct implementation of a producer and consumer.
class Q 
{
	int n;
	boolean flag = false;
	synchronized void get() 
	{
		while(!flag)
		{
		  try { wait();	} catch(InterruptedException e) {}
		}
		System.out.println("Got: " + n);  //flag=true
		flag = false;
		notify();
	}

	synchronized void put(int n) 
	{
		while(flag)
		{
		  try { wait();	} catch(InterruptedException e) {}
		}
		this.n = n;  //flag=false
		flag = true;
		System.out.println("Put: " + n);
		notify();
	}
}

class Producer extends Thread
{	Q q;

	Producer(Q q, String name) 
	{
		super(name);
		this.q = q;
	}

	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			q.put(i);
			try{ Thread.sleep(1000);}catch(Exception e){}
		}
	}
}

class Consumer extends Thread
{	Q q;
	Consumer(Q q, String name) 
	{
		super(name);
		this.q = q;
	}

	public void run() 
	{
		for(int i=0;i<5;i++)
		{
		q.get();
		try{ Thread.sleep(1000);}catch(Exception e){}
		}
	}
}

class _12_producerConsumer 
{
	public static void main(String args[]) 
	{
		Q q = new Q();
		Producer t1=new Producer(q, "Producer");
		Consumer t2=new Consumer(q, "Consumer");
		t1.start();
		t2.start();
	}
}
