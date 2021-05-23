package Introduction;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		
		String a, b = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String which you want to check palindrome or not = ");
		a = sc.nextLine();
		int n = a.length();
		for(int i=n-1;i>=0;i--)
		{
			b = b + a.charAt(i);
		}
        if(a.equals(b))
        {
        	System.out.print("This string is palindrome");
        }
        else
        {
        	System.out.print("This string is not palindrome");
        }
	
	}

}
