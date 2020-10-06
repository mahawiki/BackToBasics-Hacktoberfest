import java.io.IOException;

class _6_throwsWithNoExceptionOccurs
{
	void demo() throws IOException
	{
		System.out.println("hi ");
	}

	public static void main(String args[])
	{
	  try{
			_6_throwsWithNoExceptionOccurs obj=new _6_throwsWithNoExceptionOccurs();
			obj.demo();
		 }
	  catch(IOException e)
		 {
			System.out.println(e);
		 }
		
		System.out.println("rest of code");
	}
}