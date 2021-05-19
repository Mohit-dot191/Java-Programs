package Introduction;
import java.util.*;
public class NthPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n to compute the nth prime number = ");
		int nth = sc.nextInt(); 
		int num = 1,count = 0,i;
		
		while(count<nth)
		{
			num += 1;
			for(i=2;i<=num;i++)
			{
				if(num % i ==0)
				{
					break;
				}
				
			}
		
		if(i == num)
		
		count = count +1;
		}
	
	System.out.println("Value of nth prime = "+ num);
	}

}
