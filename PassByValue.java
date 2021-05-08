package oops;
import java.util.*;

public class PassByValue {

	public static void passValue(int x , int y)
	{
		int result;
		result = x + y;
		System.out.print("Addition is Using pass by value = " +result);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Two number = ");
		int num =sc.nextInt();
		int num1 = sc.nextInt();
		
		passValue(num,num1); //call by method

	}

}
