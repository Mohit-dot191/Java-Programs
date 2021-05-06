package ForLoops;
import java.util.*;
public class FindLargestNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();
		
		System.out.print("Enter the array = ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
			
		}
	
		
      
       int  num = arr[0];
       for(int i=1;i<size;i++)
       {
    	  
    	   if(num<arr[i])
    	   {
    		   num = arr[i];
       
           }
       }
       System.out.print("Largest number in givin array is = "+ num +" ");
	}


}
