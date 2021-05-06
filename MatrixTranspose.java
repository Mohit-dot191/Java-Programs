package ForLoops;
import java.util.*;
public class MatrixTranspose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows of matrix = ");
		int rows = sc.nextInt();
		System.out.print("Enter the coloum of martix = ");  
		int column = sc.nextInt();
		int[][] arr1 = new int[rows][column];
		int[][] arr2 = new int[rows][column];
		int[][] arr3 = new int[rows][column];
		System.out.println("Enter the first matrix = ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j] =sc.nextInt();
			}
		}
		
		System.out.println("Enter the second matrix = ");
	
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
			arr2[i][j] = sc.nextInt();
			}
		}
	
		System.out.println("Transpose matrix is = ");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				
			}
		
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr3[j][i]+" ");
			}
			  System.out.println();
		}
		
	}
}
