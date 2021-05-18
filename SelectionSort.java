package ForLoops;
import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();
		System.out.print("Enter the array elements = ");
		int arr[] = new int[size]; 
		
		
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
	
		System.out.print("Befour array is = ");
		for(int item : arr)
			System.out.print(item+" ");
		
		System.out.println();
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	
	System.out.print("Now Sorted array is = ");
	for(int item:arr)
	System.out.print(item+" ");
	}

}
