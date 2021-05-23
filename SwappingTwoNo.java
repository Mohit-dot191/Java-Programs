package Introduction;
import java.util.*;
public class SwappingTwoNo {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number = ");
		int a = sc.nextInt();
		System.out.print("Enter the Second number = ");
		int b = sc.nextInt();
		System.out.println("Befour swapping number is = " +a +" "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.print("After swapping number is = " +a +" "+ b);
	
	}

}
