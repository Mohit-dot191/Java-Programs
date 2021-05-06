package ForLoops;
import java.util.*;
public class MultiplicationOfTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows of matrix = ");
		int rows = sc.nextInt();
		System.out.print("Enter the coloum of matrix = ");
		int coloum = sc.nextInt();
		int[][] arr1 = new int[rows][coloum];
		int[][] arr2 = new int[rows][coloum];
		int[][] arr3 = new int[rows][coloum];
		
		System.out.println("Enter the first matrix = ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloum;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix = ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloum;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
	System.out.println("Multiplication of two matrix = ");
	   for(int i=0;i<rows;i++)
	   {
		  for(int j=0;j<coloum;j++)
			{
			  arr3[i][j]=0;
			   for(int k=0;k<rows;k++)
			   {
				   arr3[i][j] += arr1[i][k] * arr2[k][j];
				   
			   }
			   
			   System.out.print(arr3[i][j]+" ");
		   }
		   System.out.println();
	   }
	
	
	
	}

}
