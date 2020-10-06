class _3_finally
{
	public static void main(String args[])
	{
		try{
			 int temp=10/0;
		   }
		catch(Exception e)
		   {	// in exam write message in exception dont print exception object
		   	System.out.println(" exception occured "+e);
		   }
		finally
	   	   {
	   	   	System.out.println("finally code executed");
		   }
		System.out.println("rest code");
	}
}