package ForLoops;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();
		System.out.print("Enter the array elements = ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
		  arr[i] = sc.nextInt();
		}
		
		System.out.print("Befour array is = ");
		for(int item : arr)
			System.out.print(item+" ");
		
		for(int i=0;i<size;i++)
		{
			int key = arr[i];
			int j = i-1;
		
			while(j>=0 && key < arr[j])
			{
				arr[j+1] = arr[j];
				--j;
			}
		
		arr[j+1] = key;
		
		}
	System.out.println();
	
	System.out.print("After sorting array is = ");
	for(int item : arr)
		System.out.print(item+" ");
	
	}

}
