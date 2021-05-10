package oops;

//No argument constructor code starting 
 class Vechile {
	
	int wheels;
	 Vechile()
	{
		wheels = 4;	
	}
	
 }
//No argument constructor code Ending 


// parameterized  constructor code starting  
class Add{
	int sum;
	Add(int a,int b)
	{
	sum = a + b; 	
	System.out.println("Addition is = " + sum );
	}
}
//parameterized  constructor code Ending 


//defautl constructor code starting
class Man
{
int legs;
int eyes;
	Man()
	{
		System.out.println("By default legs = "+legs+" "+"and "+"By default eyes = "+eyes);
	}
}
//defautl constructor code ending 
 

//constructor Overloading code starting
class Multiple
{
  int result;	

  Multiple(int a,int b)
  {
	  result = a * b;
	  System.out.println("Multiple is = "+ result);
  }

  Multiple(int x,int y,int z)
  {
	  result = x * y * z;
	  System.out.println("Multiple is = "+result);
  }
}
//constructor Overloading code ending 


// consturctor using this keyword code starting
class PenStore
{
	int bluePen;
	int blackPen;
	PenStore(int bluePen,int blackPen)
	{
		this.bluePen = bluePen;
		this.blackPen = blackPen;
		System.out.println("BluePen is = "+bluePen +" and "+"BlackPen is = "+blackPen);
	}

}
//consturctor using this keyword code ending


public class AllTypeConstructor{
	public static void main(String[] args) 
	{
		
		Vechile car = new Vechile();
		System.out.println("There are " +car.wheels + " "+"Wheels in car");
		Add addition = new Add(1,2);
		Man man1 = new Man();
		Multiple obj = new Multiple(2,2);
		Multiple obj1 = new Multiple(2,2,2);
		PenStore pen = new PenStore(100,100);
	}	

}
