import java.io.*;

class _3_readDataAndWriteInAnother
{
	public static void main(String args[])
	{
	    try{
			FileInputStream fin=new FileInputStream("abc.txt");
			FileOutputStream fout=new FileOutputStream("def.txt");
			int i;
			while((i=fin.read())!=-1)
				{
					fout.write(i);
				}
				fin.close();
				fout.close();
			System.out.println("data read and stored .....");

			}
			catch(IOException ioe)
			{
				System.out.println("Exception: "+ioe);
			}
	    }
}