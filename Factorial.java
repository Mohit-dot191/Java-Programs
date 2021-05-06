package Introduction;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number which you want to find Factorial = ");
	int num = sc.nextInt();
	int fact=1;
	while(num>0)
	{
		fact = fact * num;
		num--;
	}
	System.out.println("Factorial is = " + fact);
	}

}
