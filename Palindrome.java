package WhileLoops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to check palindrome or not = ");
		int num = sc.nextInt();
		int temp= num;
		int reverse=0;
		
		while(temp>0)
		{
			int lastDigit = temp%10;
			reverse = reverse * 10 + lastDigit;
			temp /=10;
		}
	if(reverse==num)
	{
		System.out.println("Your number is palindrome = "+num);
	}
	else 
	{
		System.out.println("Your number is not palindrome = "+num);
	}
	}

}
