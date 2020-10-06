
public class _23_matrixMultiplication
{
	public static void main(String[] args) 
	{
		int r=2, c=2;
		int mul[][]=new int[2][2];
		int arr1[][]= {
						{1,2},
						{3,4}
					 };

		int arr2[][]= {
						{4,3},
						{2,1}
					 };
		
		for (int i=0;i<r;i++) 
		{
			for (int j=0;j<c;j++)
			{
				mul[i][j]=0;
				for (int k=0;k<r;k++)
				{
					mul[i][j]+= arr1[i][k]*arr2[k][j];
				}
			}
		}

		for(int i[] :mul)
		{
			for(int j: i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}

}
