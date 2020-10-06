
 class Callme 
 { 
	 synchronized void call(String msg) 
	{
		System.out.print("[" + msg);
		try {	Thread.sleep(1000);	} catch(InterruptedException e) {}
		System.out.println("]");
	}
}
class Caller implements Runnable 
{
	String msg;
	Callme obj;
	Thread t;
	public Caller(Callme targ, String s) 
	{
		obj = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() 
	{
		obj.call(msg);
	}
}

class _7_methodSynchronizationAccBook 
{
	public static void main(String args[]) 
	{
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");
		// wait for threads to end
		try {
		ob1.t.join();
		ob2.t.join();
		ob3.t.join();
		} catch(InterruptedException e) {}
	}
}


