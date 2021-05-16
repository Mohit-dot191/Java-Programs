package Introduction;
import java.util.*;
public class FindingVowels {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String which you find vowels present or not = ");
	String str = sc.nextLine();
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
		System.out.println("find vowels" +" "+str.charAt(i)+" "+"at position " +i);
		count++;
		}
		
	}
	
	if(count==0)
	{
		System.out.println("Here not prsent any vowels");
	}
	
	}

}
