package WhileLoops;
import java.util.*;

public class AddNoAllDigits {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you add all digits = ");
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int lastDigit = temp%10;
			temp/=10;
			sum +=lastDigit;
			
		}
	System.out.println("Addition all digit = "+sum);
	}

}
