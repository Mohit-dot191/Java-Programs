package oops;

class Human {
	//overriding method
	public void eat() {
		
		System.out.print("Human is eating");
	
	}
}

public class MethodOverriding extends Human {

	public void eat() {
		
	System.out.println("Here MethodOverriding");
}
	public static void main(String[] args) {
		
     MethodOverriding obj = new MethodOverriding();
     obj.eat();
	
	}

}



	
	
	