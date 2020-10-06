import java.util.*;

public class _32_vectorClassExamQue 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Vector v1=new Vector(3,2);
		System.out.println("enter how many integers you want to add: ");
		int no=input.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("enter "+(i+1)+"th integer:");
			int temp=input.nextInt();
			v1.addElement(temp);
		}
				
		System.out.println("enter element to delete from vector:");
		int del=input.nextInt();
		boolean val=v1.removeElement(del);
				
		for(Object i: v1)
		{
			System.out.println(i);
		}
	}
}
