package WhileLoops;
import java.util.*;
public class Armstorng {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want to check ArmStorng or not = ");
		int num = sc.nextInt();
		int temp = num;
	    int sum=0;
	    
	    while(temp != 0)
	    	{
	    	int rem = temp % 10;
	    	sum = sum + (rem * rem * rem); 
	    	temp /= 10;
	    	
	    	
	    	}
    if (num == sum)
    {
    	System.out.println("Your number is ArmStorng = "+num);
    }
    else
    {
    	System.out.println("Your number is not ArmStorng = "+num);
    }
	}

}
