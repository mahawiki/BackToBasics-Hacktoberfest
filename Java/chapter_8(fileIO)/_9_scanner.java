import java.util.*;
import java.io.*;

class _9_scanner
{
	public static void main(String args[])
	{
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name and rollno ");
		String name=sc.nextLine();
		int rollNo=sc.nextInt();
		System.out.println(name+" "+rollNo);
		sc.close();
		//riddhi 44

		File f =new File("abc.txt");
		Scanner sc2=new Scanner(f);
		
		while(sc2.hasNextLine())
		{
			System.out.print(sc2.nextLine());
		}
		sc2.close();
		}
		catch(Exception e){}
	}
}