package oops;

public class ExceptionHandling {

public static void main(String[] args)
{
	
	
	try {
	int a=5;
	int b=0;
	int c=a/b;
	}catch(ArithmeticException e)
	{
		System.out.println(e.getMessage()+" ");
	}
  
	
}
}
