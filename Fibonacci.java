package Introduction;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to longest Fibonacci series = ");
		int size = sc.nextInt();
		int num1=0,num2=1,sum=0;
		System.out.print(num1+" "+num2 +" ");
		for(int i=0;i<size;i++)
		{
			sum = num1 + num2;
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
		}
	}

}
