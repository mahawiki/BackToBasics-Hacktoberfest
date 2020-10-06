import java.io.*;

class _2_fileInputStream
{
	public static void main(String args[])
	{
	 try{
	 	FileInputStream fin=new FileInputStream("abc.txt");
		int i;
	 		while((i=fin.read())!=-1)
			{
				System.out.print((char)i+" ");
			}
			fin.close();
			System.out.println("\nread success.....");
		}
		catch(IOException ioe)
		{  System.out.println("Exception: "+ioe);
		}
	}
}