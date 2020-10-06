
class Table
{
	synchronized static void display(int no)
	{
	try{  System.out.println("Table of "+no+":");
			for(int i=1;i<=10;i++)
			{
				System.out.println(no*i);
				Thread.sleep(500);
			}
		}catch(Exception e){}
	}
}

class Demo1 implements Runnable
{
	public void run()
	{
		Table.display(5);
	}
}

class Demo2 implements Runnable
{
	public void run()
	{
		Table.display(2);
	}
}

class _6_staticSynchronization
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Demo1());
		Thread t2=new Thread(new Demo2());
		t1.start();
		t2.start();
	}
}