class Demo1 implements Runnable
{
	public void run()
	{
	try{
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
					System.out.println("even no: "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e){}
	}

}

class Demo2 implements Runnable
{
	public void run()
	{
	try{
			for(int i=1;i<=10;i++)
			{
				if(i%2==1)
					System.out.println("odd no: "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e){}
	}
}

class _18_oddEvenNoByTwoThreadsupto100
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new Demo1());
		Thread t2=new Thread(new Demo2());
		t1.start();
		t2.start();

	}
}