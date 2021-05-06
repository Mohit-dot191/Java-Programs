package ForLoops;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String = ");
          String name = sc.nextLine();
          String rev ="";
          
          for(int i=name.length()-1;i>=0;i--)
          {
        	rev = rev + name.charAt(i);
          }
          
          System.out.println("Your reverse string is = " +rev);
	
	}

}
