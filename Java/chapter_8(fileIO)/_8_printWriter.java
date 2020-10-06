import java.io.*;

class _8_printWriter
{
	public static void main(String args[])
	{
	try{//write to console
		PrintWriter pw1=new PrintWriter(System.out,true);
		String str="using write ...";
		pw1.write(str);
		pw1.println("using println...");
		pw1.write("using print...");
		int no=2;
		pw1.print(no);
		pw1.close();

		//write to file
		PrintWriter pw2=new PrintWriter(new FileWriter("abc.txt",true));
		int n=20;
		pw2.write("this is third line "+n );
		//pw2.print("this is second line "+n );
		pw2.close();

		}
		catch(Exception e){}
	}
}