import java.util.Scanner;
class OneToNTable{
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number = ");
	int n = sc.nextInt();
	int table;

	for(int i=1;i<=n;i++)
 	{
	
	int tableOf = i;
	for(int j=1;j<=10;j++){
	
	table = tableOf*j; 
	System.out.print(table + " ");
	}	
	System.out.println();
	}
}
}