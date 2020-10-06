
class _1_mainThread  // + currentThread() , setname() , getName() , sleep()
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);

		t1.setName("mainThread");
		System.out.println("after setting name: "+t1.getName());

		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try{ Thread.sleep(1000);}catch(Exception e){ }
		}
	}
}