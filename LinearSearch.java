package ForLoops;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();		
		
		int[] arr = new int[size];
		
		System.out.print("Enter the array elemensts = ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
  
		System.out.print("Enter the number which you want to search = ");
		int num = sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==num) 
			{
			c++;	
			}
				
		
		}
	
		if(c==0)
	
		System.out.print(num +" " +"No in not Found in givin array ");
	else
	
		System.out.print(num +" " +"No is found in array");
		
		
		}

}
