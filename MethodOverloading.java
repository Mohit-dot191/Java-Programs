package oops;
import java.util.*;
 //Method Overloading -- call same method but diffrent parameters this is called Method Overloading
public class MethodOverloading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number = ");
		int num1 = sc.nextInt();
		
		Method obj = new Method();
		obj.add(num1,6);  //same method
		obj.add(num1,5,7); //same method but diff. parameters
	
	}
}

class Method
{
	
	public void add(int a,int b) //same method call
	{
		int result = a + b;
		System.out.println("Addition of a and b = " + result);
	}
			
	public void add(int a,int b,int c) //Calling same method but different parameters 
	{
		int result = a + b + c;
		System.out.println("Additon of a b and c = "+ result);
	
	}
}


