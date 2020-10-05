class _2_tryMultipleCatch
{
	public static void main(String args[])
	{
		try{
			int arr[]=new int[5];
			arr[6]=10/2;  //  10/0;
		   }
		   catch(ArithmeticException ae)
		   {
		   	System.out.println(ae);
		   }
		   catch(ArrayIndexOutOfBoundsException ai)
		   {
		   	  System.out.println(ai);
		   }
		   catch(Exception e)
		   {
		   	System.out.println("unknown exception "+e);
		   }
		System.out.println("rest code");
	}
}