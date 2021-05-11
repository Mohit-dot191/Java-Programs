package oops;

public class StaticKeyword {

	static 
	{
		System.out.println("This is first static block");
	}
	
	static
	{
		System.out.println("This is second static block");
	}
	public static void main(String[] args) {
		
		System.out.println("Inside Main ");
	}

	static 
	{
		System.out.println("This is third static block");
	}
}
