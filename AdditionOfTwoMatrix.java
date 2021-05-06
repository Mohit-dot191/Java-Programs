package ForLoops;
import java.util.*;
public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows of matrix = ");
		int rows = sc.nextInt();
		System.out.print("Enter the coloum of martix = ");  
		int coloum = sc.nextInt();
		int[][] arr1 = new int[rows][coloum];
		int[][] arr2 = new int[rows][coloum];
		int[][] arr3 = new int[rows][coloum];
		System.out.println("Enter the first matrix = ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloum;j++)
			{
				arr1[i][j] =sc.nextInt();
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
	
		System.out.println("Additon of two matrix = ");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloum;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
		System.out.println();
		}
		
	
	
	}

}
