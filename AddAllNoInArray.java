package ForLoops;
import java.util.*;
public class AddAllNoInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int result=0;
		System.out.print("Enter the array elements = ");
		
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Your input array is = ");
		for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");

		for(int i=0;i<size;i++)
		{
			result +=arr[i];
		}
		System.out.println();
	System.out.println("Additon of all no in array = " + result );
	}


}
