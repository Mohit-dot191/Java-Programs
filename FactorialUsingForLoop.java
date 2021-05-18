package Introduction;
import java.util.Scanner;
public class FactorialUsingForLoop {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number which you want find the factorial = ");
	int num = sc.nextInt();
	int fact=2;
	for(int i=num;i>2;i--)
	{
		fact = fact * i;
		
	}
	System.out.print("Factorial is = "+fact);
	}

}
