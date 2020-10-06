class Table
{
	 void display(int no)
	{
	synchronized (this)
		{
		try{ 
			 System.out.println("Table of "+no+":");
				for(int i=1;i<=10;i++)
				{
					System.out.println(no*i);
					Thread.sleep(1000);
				}
			}catch(Exception e){}
		}
	}
}

class Demo1 implements Runnable
{ Table t;
	Demo1(Table obj)
	{
		t=obj;
	}
	public void run()
	{
		t.display(5);
	}
}

class Demo2 implements Runnable
{ Table t;
	Demo2(Table obj)
	{
		t=obj;
	}
	public void run()
	{
		t.display(2);
	}
}

class _8_synchronizedBlock
{
	public static void main(String[] args) 
	{
		Table t=new Table();	//one object is shared
		Thread t1=new Thread(new Demo1(t));
		Thread t2=new Thread(new Demo2(t));
		t1.start();
		t2.start();
	}
}