package Introduction;

import java.util.Scanner;
public class AddNNaturalNumber {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number = ");
	int number = sc.nextInt();
	System.out.println(sum(number));
	}

	static int sum(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		else
		{
			return(num +sum(num-1)); 
		}
	}
}
