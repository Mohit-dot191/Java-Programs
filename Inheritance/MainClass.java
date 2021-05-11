package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		//Person class extends by teacher  
		Teacher t = new Teacher();
		t.name = "Mohit Pant";
		t.walk();
		t.eat();
		t.teach();
		// end
		
		
		//Person class extends by Singer 
		Singer s = new Singer();
		s.name = "Manisha pandey";
		s.walk();
		s.eat();
		s.sing();
	    //end
		
	}

}
