import java.io.*;
//checked exception
class _5_throws
{
	void demo() throws IOException
	{
		throw new IOException("Exception");
	}

	void demo2() throws IOException
	{
		demo();
	}

	public static void main(String args[])
	{
	  try{
			_5_throws obj=new _5_throws();
			obj.demo2();
		 }
	  catch(IOException e)
		 {
			System.out.println(e);
		 }
		
		System.out.println("rest of code");
	}
}

/*
//unchecked exception
class _5_throws
{
	void demo() throws ArithmeticException 
	{
		throw new ArithmeticException("ArithmeticException");
	}

	void demo2() throws ArithmeticException
	{
		demo();
	}

	public static void main(String args[])
	{
	  try{
			_4_throws obj=new _4_throws();
			obj.demo2();
		 }
	  catch(ArithmeticException e)
		 {
			System.out.println("Exception "+e);
		 }
		
		System.out.println("rest of code");
	}
}
*/