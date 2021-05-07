package ForLoops;
import java.util.*;
public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to Factorial = ");
		int num = sc.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of entered number is = " + factorial);
	}

	
	public static int fact(int n)
	{
		int output;
		if(n == 1)
			return 1;
		else
			output = n *fact(n-1);
			return output;
	}
}
