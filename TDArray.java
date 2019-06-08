import java.util.*;
public class TDArray
{
	public static void main(String[] args)
	{
		int i,j;
		double arr[][] = new double[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int row = sc.nextInt();
		System.out.println("Enter Cols: ");
		int col = sc.nextInt();
		System.out.println("Enter Elements into Array: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextDouble(); 
			}
		}
		System.out.println("The Arr Elements Are: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}
