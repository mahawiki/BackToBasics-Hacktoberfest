import java.io.*;

class _7_bufferedReader
{
	public static void main(String args[])
	{
	try{
		//read from console
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name and roll no ");
		String name=br1.readLine();
		int rollNo=Integer.parseInt(br1.readLine());
		System.out.println(name+" "+rollNo);
		br1.close();
		//riddhi pawar 4958

		//read from file
		BufferedReader br2=new BufferedReader(new FileReader("abc.txt"));
		System.out.println(" data is:");
		int i;
		while((i=br2.read())!=-1)
		{
			System.out.print((char)i);
		}
		br2.close();

		}
		catch(Exception e){}
	}
}