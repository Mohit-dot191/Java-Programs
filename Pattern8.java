package Introduction;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to longest pattern =");
		int num = sc.nextInt();
		System.out.println("Your pattern is :");
		int rows=2*num-1;
		for(int i=1;i<=rows;i++)
		{
			if(i<=num)
			{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
			System.out.print("*");
			}
			}
			else 
			{
			for(int j=1;j<=i-1;j++)
		    {
			System.out.print(" ");
		    }
			for(int j=1;j<=rows-i+1;j++)
			{
				System.out.print("*");
			}
			}
		    System.out.println();
		    
		}

	}

}
