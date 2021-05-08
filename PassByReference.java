package oops;
import java.util.*;
public class PassByReference {

	public static void reference(int array[])
	{
		array[3] = 98;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 4 minimum size of array  = ");
		int size = sc.nextInt();
		System.out.print("Enter the array elements = ");
		int[] arr = new int [size]; 
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		reference(arr);
		
		System.out.print("By reference array is = ");
		for(int item : arr)
			System.out.print(item+" ");
	}

}
