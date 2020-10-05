import java.io.*;

class _1_fileOutputStream 
{
	public static void main(String args[])
	{
	try{
		FileOutputStream fout=new FileOutputStream("abc.txt");
		String str1="this is the first line";
		byte arr[]=str1.getBytes();
		fout.write(arr);
		fout.close();
		System.out.println("data written.....");
		}
		catch(IOException ioe)
		{  System.out.println("Exception : "+ioe);
		}
	}
}