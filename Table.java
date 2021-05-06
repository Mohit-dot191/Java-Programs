package ForLoops;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number where end this Table = ");
	
		int table = sc.nextInt();
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(table*i);
		}
		System.out.println();
		
	}

}
