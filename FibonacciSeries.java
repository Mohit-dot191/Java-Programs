package Introduction;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to longest Fibonacci series = ");
		int size = sc.nextInt();
		int num1=0,num2=1,sum=0;
		for(int i=0;i<size;i++)
		{
			System.out.print(febo(i)+" ");	
		}
		
	}

		public static int febo(int n)
		{
			if(n == 0 )
				return 0;
				else if(n ==1)
				return 1;
		
			else
			{
				return febo(n-1) + febo(n-2);
				
			}
		
		}
			

}
