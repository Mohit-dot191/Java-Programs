package WhileLoops;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size = ");
		int size = sc.nextInt();
		
		System.out.print("Enter the array = ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] =  sc.nextInt();
		}
		
		System.out.print("Enter the number which you want to search = ");
		int num = sc.nextInt();
	
		int low=0;
		int high=size-1;
		int mid=(low+high)/2;
		
	
		while((arr[mid]!=num) && (low<high))
		{
			if(arr[mid]>num)
			{
				high = mid-1;
				
			}
			else
			{
				low = mid+1;
			}
		mid = (low+high)/2;
		}
	
	if(arr[mid]==num)
	{
		System.out.print("No is found in array = "+ num);
	}
	else
	{
		System.out.print("No is not found in array");
	}
	
	
	}

}
