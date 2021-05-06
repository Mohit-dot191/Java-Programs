package Introduction;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("1:Addition 2:substract 3:multiple 4:divide");
	System.out.print("Enter your choice = ");
	int choice = sc.nextInt();
	int result;
	System.out.print("Enter two number = ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	switch(choice)
	{
	case 1:
		result = num1 + num2;
		System.out.print("Addition is = "+result);
		break;
	
	case 2:
		result = num1 - num2;
		System.out.print("Subtract is = "+result);
		break;
		
	case 3:
		result = num1 * num2;
		System.out.print("multiple is = "+result);
		break;
		
	case 4:
		result = num1 / num2;
		System.out.print("Divide is = "+result);
		break;
	
	default:System.out.print("Enter wrong choice");
	}
	
	
	}

}
