package Introduction;
import java.util.*;
public class StringPermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string = ");
		String first = sc.nextLine();
		System.out.print("Enter the second String = ");
		String second = sc.nextLine();
	
    	//Check length of both String 
		if(first.length() != second.length())
		{
			System.out.print("Both string are not permutation");
			return;
		}
		
		//First String convert to char array and sorted
		char[] arr1 = first.toCharArray();
		Arrays.sort(arr1);
		first = new String(arr1);
		
		//Second String convert to char array and sorted
		char[] arr2 = second.toCharArray();
		Arrays.sort(arr2);
		second = new String(arr2);
		
		
		//Check String are permutation or not 
		if(first.equals(second))
		{
			System.out.print("Both string are permutation");
		}
		else
		{
			System.out.print("Both string are not permutation");
		}
	}

}
