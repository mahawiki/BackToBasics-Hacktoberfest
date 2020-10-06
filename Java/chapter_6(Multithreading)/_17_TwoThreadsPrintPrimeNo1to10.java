class Demo extends Thread
{
	public void run()
	{
		int flag,i,n;
		for( n=2;n<=10;n++)
		{ flag=0;
			for(i=2;i<n;i++)
				{ 
					if(n%i==0)
					{	flag=1;
						break;
					}
				}
			if(flag==0)
			System.out.println(n);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}

}

class _17_TwoThreadsPrintPrimeNo1to10
{
	public static void main(String args[])
	{
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t2.start();
	}
}