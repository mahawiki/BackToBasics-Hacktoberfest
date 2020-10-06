import java.io.*;

class _4_fileWriter 
{
	public static void main(String args[])
	{
	try{
		FileWriter fw=new FileWriter("abc.txt",true);
		String str1="this is the second line";
		//byte arr[]=str1.getBytes();
		fw.write(str1);
		fw.close();
		System.out.println("data written.....");
		}
		catch(IOException ioe)
		{
			System.out.println("Exception : "+ioe);
		}
	}
}