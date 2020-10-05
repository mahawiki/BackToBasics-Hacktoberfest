import java.io.*;

class _12_printNoOfWords
{
	public static void main(String[] args) 
	{
	try{
		FileWriter fw=new FileWriter("file1.txt");
		fw.write("this is the first line");
		fw.close();

		FileReader fr=new FileReader("file1.txt");
		System.out.println("reading....");
		int i,wc=0;
		char ch;
		if((i=fr.read())!=-1)
		{
			wc++;
		}
		while((i=fr.read())!=-1)
		{
			ch=(char)i;
			if(ch==' ' || ch=='\t' || ch=='\n')
			{
				wc++;
			}
		}

		System.out.print("\n total words in file are: "+wc);
		fr.close();
		}catch(Exception e){}
	}
}