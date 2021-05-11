package oops;
import java.util.Scanner;

class Student
{
	private int age;  
	private String name;
	
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age)
	{
		if(age > 20)
		{
			System.out.println("Selected");
		}
		else
		this.age = age;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student stu = new Student(); 
		System.out.print("Enter the age = ");
		int age = sc.nextInt();
		stu.setAge(age);
		stu.getAge(); // return type 
	}

}
