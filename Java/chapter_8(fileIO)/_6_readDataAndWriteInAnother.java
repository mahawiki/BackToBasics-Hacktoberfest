import java.io.*;

class _6_readDataAndWriteInAnother
{
	public static void main(String args[])
	{
	    try{
			FileReader fr=new FileReader("abc.txt");
			FileWriter fw=new FileWriter("def.txt");
			int i;
			while((i=fr.read())!=-1)
				{
					fw.write(i);
				}
				fr.close();
				fw.close();
			System.out.println("data read and stored .....");

			}
			catch(IOException ioe)
			{
				System.out.println("Exception: "+ioe);
			}
	    }
}