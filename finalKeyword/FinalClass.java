package finalKeyword;

final class Demo  // This class do not create other objects
{
	public void display()
	{
		System.out.println("Hello World !");
	}
}
	
public class FinalClass{
	public static void main(String[] args)
	{
		Demo f = new Demo();
		f.display();
		
	}
}
