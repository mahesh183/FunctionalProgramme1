// ///////////////////////////////////////////
// ///Programme: Tow diamensional array 
// ///Author   : Mahesh Aurad
// ///Date     : 13 june 2019
// ///Input    : row=3,col=3
// ///Output   :  3 | 5  | 31 |
// /// 	       :  4 | 51 | 12 |
// ///         :  7 | 2  | 34 |
// ///////////////////////////////////////////

import java.util.*;
public class TwoDArray
{
	public static void main(String[] args)
	{
		int rowCount,colCount;
		double arr[][] = new double[10][10];
		Scanner sc=new Scanner(System.in);

		//Accept number of rows from user
		System.out.println("Enter Rows: ");
		int row = sc.nextInt();

		//Accept number of rows from user
		System.out.println("Enter Cols: ");
		int col = sc.nextInt();

		//Accept the elements of two diamensional array
		System.out.println("Enter Elements into Array: ");
		for(rowCount=0;rowCount<row;rowCount++)
		{
			for(colCount=0;colCount<col;colCount++)
			{
				arr[rowCount][colCount]=sc.nextDouble(); 
			}
		}

		//print the elements of two diamensional array
		System.out.println("The Arr Elements Are: ");
		for(rowCount=0;rowCount<row;rowCount++)
		{
			for(colCount=0;colCount<col;colCount++)
			{
				System.out.println(arr[rowCount][colCount]);
			}
		}
	}
}

//eND OF THE PROGRAMME
