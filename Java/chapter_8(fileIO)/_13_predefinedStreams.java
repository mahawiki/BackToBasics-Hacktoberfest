import java.io.*;
class _13_predefinedStreams
{
	public static void main(String[] args) 
	{	 int no=0;
		System.out.println("Enter a number: ");
		try{ no=System.in.read();  }catch(Exception e){}
		System.err.println("no is"+(char)no);
	}
}