package Introduction;
import java.util.*;
public class PrimeOrNot {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number which you check prime or not = ");
	int num = sc.nextInt();
	int c=0;
	if(num % 2 == 0)
	{
		c++;
	}
	
	if(c==0)
	{
		System.out.print(num +" "+ "No is prime");
	}
	
	else
	{
		System.out.print(num +" "+ "No is not prime");
	}
	
	
	
	}

}
