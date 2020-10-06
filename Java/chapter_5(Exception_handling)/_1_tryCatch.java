class _1_tryCatch
{
	public static void main(String args[])
	{
		try{
			int temp=10/0; 
			//int temp=10/2;
		   }
		  catch(Exception e)
		   {	// in exam write message in exception dont print exception object
		   	 System.out.println(" exception occured "+e);
		   }
		System.out.println("rest code");
	}
}