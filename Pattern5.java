package Introduction;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to longest pattern =");
		int num = sc.nextInt();
		System.out.println("Your pattern is :");
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");
			}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}

}
