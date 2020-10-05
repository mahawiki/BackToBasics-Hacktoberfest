import java.io.IOException;
class _4_throw
{
	public static void main(String args[]) 
	{	//checked exception
		try{
			  throw new IOException("io ");
			}
		catch(IOException ioe)
			{
				System.out.println("exception caught "+ioe);
			}
		System.out.println("rest code");

		

		//unchecked exception
		try{
			  throw new NullPointerException("NullPointer ");
			}
		catch(NullPointerException npe)
			{
				System.out.println("exception caught "+npe);
			}
		System.out.println("rest code");
	}
}