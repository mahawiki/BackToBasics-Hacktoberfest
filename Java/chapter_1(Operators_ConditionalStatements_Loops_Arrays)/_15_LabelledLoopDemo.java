
public class _15_LabelledLoopDemo 
{
	public static void main(String[] args) 
	{
label1:	for(int i=0;i<5;i++)
		{
			System.out.print(i+": ");
label2:		for(int j=0;j<5;j++)
			{
				System.out.print(j+" ");
				if(j==2)
					break label1;
			}
			System.out.println();
		}
	}
}
