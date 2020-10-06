class Customer
{  
	int balance=1000;  
  
	synchronized void withdraw(int amount)
	{ 
	try
		{
		System.out.println("going to withdraw..."); 
		Thread.sleep(1000);
		if(balance<amount)
		{  
			System.out.println("Less balance; waiting for deposit...");  
			wait();
		}  
		balance = balance - amount;  
		System.out.println("withdraw completed..."+balance);  
		}
		catch(Exception e){}  
	}  
  
	synchronized void deposit(int amount)
	{ 
	try
		{ 
		System.out.println("going to deposit..."); 
		Thread.sleep(2000);
		balance = balance+amount;  
		System.out.println("deposit completed... "+balance);  
		Thread.sleep(1000);
		notify();  
	    }
		catch (Exception e){}  
	}
}

class CheckThread extends Thread
{
	Customer c;
	
	CheckThread(Customer c,String name)
	{
		super(name);
		this.c=c;
	}
	
	public void run()
	{
		String tname=Thread.currentThread().getName();
		if (tname.equals("t1"))
		{
			c.withdraw(1500);
		}
		else
		{
			c.deposit(1000);
		}
	}
}
  
class _12_interThreadCommunication
{  
	public static void main(String args[])
	{  
		Customer c=new Customer(); 
		CheckThread t1=new CheckThread(c,"t1");
		CheckThread t2=new CheckThread(c,"t2");
		t1.start();
		t2.start();
	}
}  