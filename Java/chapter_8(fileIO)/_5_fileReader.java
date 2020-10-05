import java.io.*;

class _5_fileReader
{
	public static void main(String args[])
	{
	 try{
	 	FileReader fr=new FileReader("abc.txt");
		int i;
	 		while((i=fr.read())!=-1)
			{
				System.out.print((char)i+" ");
			}
			fr.close();
			System.out.println("read data.....");
		}
		catch(IOException ioe)
		{
			System.out.println("Exception: "+ioe);
		}
	}
}