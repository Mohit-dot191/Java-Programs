package finalKeyword;

class Demo{
public final void display()
{
	System.out.println("Hello World !"); // This Method do not change 
}
}

public class FinalMethod {

	public static void main(String[] args) {
	
	Demo d = new Demo();
	d.display();
	}

}
