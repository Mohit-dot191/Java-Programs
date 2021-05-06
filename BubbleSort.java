package ForLoops;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();
		int[] arr =new int[size];
		System.out.print("Enter the array = ");
		
		for(int i=0;i<size;i++)
		{
		 arr[i] = sc.nextInt();
		}
	
		for(int i=0;i<size-1;i++)
		{
			boolean sorted = true;
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
						{
						int	temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						sorted = false;
						}
			}
		
		if(sorted)
			break;
		}
	
		System.out.print("Sorted arry is = ");
		for(int item : arr)
	
		{
		System.out.print(item +" ");
		}
	
	}

}
