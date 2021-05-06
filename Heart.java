import love.*;      //import love folder 
import java.util.Scanner;
public class Heart{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println();
System.out.println("------------------------USE FULL SIZE COMMAND PROMPT------------------------------");
System.out.println();

//using get-set method
//User-pass code Starting
System.out.println();
System.out.print("Enter the user-id = ");

String id=sc.nextLine();
System.out.println();
System.out.print("Enter the password = ");

String pass=sc.nextLine();
System.out.println();
int sum;
UserPassword obj= new UserPassword();
obj.setPass(id,pass);
sum=obj.getPass();

//User-Pass code Ending


if(sum==2)
{
//Love percentage code is starting

System.out.println();
System.out.println();
System.out.println("----------------------------------------------------------------------------------");	      
System.out.println("------------------------This game is only Lover game------------------------------");
System.out.println("----------------------------------------------------------------------------------");	
System.out.println();
System.out.println();
System.out.println("-----------------------Now here we can find our love percentge--------------------");
System.out.println();
System.out.println("-------------------------------Let get started------------------------------------");
System.out.println();
System.out.println("-------------Name only small letters and full name  dont't use spaces-------------");
System.out.println();
System.out.print("like Enter you name = mohitchandrapant");
System.out.println();
System.out.print("like Enter you lover name = manishapandey");
double sum1=0,sum2=0,per;
	System.out.println();
	System.out.println();
System.out.println();
        System.out.print("Enter your name = ");
	
String s1=sc.nextLine();
	System.out.print("Enter your lover name = ");

String s2=sc.next();	
System.out.println();		
char[] arr1= s1.toCharArray();
	char[] arr2= s2.toCharArray();
	int n=0,i=0;
	for(char ch : arr1)
	{
		n=(int) arr1[i++];
		sum1=sum1+n;
	}
	//System.out.println(sum1);
	i=0;
	for(char ch : arr2)
	{
		n=(int) arr2[i++];
		sum2=sum2+n;
	}
	//System.out.println(sum2);
	if(sum1<=sum2)
	 per=(sum1/sum2)*100;
	else
	 per=(sum2/sum1)*100;
System.out.println("----------------------------------------------------------------------------------");
System.out.println("----------------------------------------------------------------------------------");     
System.out.println("----------------------------------------------------------------------------------");
System.out.println();
System.out.println("If you can see our Love Percentage then enter 1");
System.out.println();
System.out.println("If you can't see our Love Percentage then enter 2");
System.out.println();


System.out.print("enter number = ");
int number =sc.nextInt(); 
if(number==1)
{
if(per>=75)
{
System.out.println();
System.out.println("----------------------------------------------------------------------------------");
System.out.println("Our love percentage is = "+per);
System.out.println();
System.out.println("----------------------------------------------------------------------------------");
System.out.println("we are lucky couple");
System.out.println("----------------------------------------------------------------------------------");
System.out.println();
}
else if(75>=per && per>=50) 
{
System.out.println();
System.out.println("----------------------------------------------------------------------------------");
System.out.println("Our love percentage is = "+per);
System.out.println();
System.out.println("----------------------------------------------------------------------------------");
System.out.println("we are normal couple");
System.out.println("----------------------------------------------------------------------------------");
System.out.println();
}

//I LOVE YOU FULL CODE STARTING
System.out.println();
System.out.println("----------------------------------------------------------------------------------");
System.out.println("Do you continue this code then enter 1 ");
System.out.println();
System.out.print("exit this code then enter any key = ");

int cont=sc.nextInt();
if(cont==1)
{
System.out.println("----------------------------------------------------------------------------------");
System.out.println();
//I pettern code starting
for(int row=0;row<=10;row++)
{
System.out.print("I"+" ");
}
System.out.println();
for(int row=0;row<=10;row++)
{
System.out.print("I"+" ");
}
System.out.println();

for(int row=0;row<=10;row++)
{
System.out.println("        I I");
}




for(int row=0;row<=10;row++)
{
System.out.print("I"+" ");
}
System.out.println();
for(int row=0;row<=10;row++)
{
System.out.print("I"+" ");
}
System.out.println();

// I pettern code ending




//Heart shape code is stating

for(float y=(float) 1.3;y>-0.99;y -=0.1){
			for(float x=(float)-2.5;x<2.5;x+=0.05){
				float a = x*x+y*y-1;
				if((a*a*a-x*x*y*y*y)<=0.0){
					System.out.print("*");
				}else
					System.out.print(" ");
				}
				System.out.println();
			}
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

//Heart shape code is ending

//You pettern code staring

for(int y=0;y<=11;y++)
{
for(int o=0;o<=2;o++)
{
System.out.print("*");
}
for(int u=1;u<=6;u++)
{
if(y>9 && y<=11)
{
System.out.printf("**");
}
else
{
System.out.printf("  ");
}
}
for(int o=0;o<=2;o++)
{
System.out.printf("*");
}
System.out.println();
}
System.out.println("----------------------------------------------------------------------------------");
System.out.println();
System.out.println();


//Prposal accpted or not code starting
System.out.println("----------------------------------------------------------------------------------");
System.out.print("Do you love me then Enter yes = 1 another no = 2 ");

System.out.println();
System.out.println();
System.out.print("Enter the number = ");
int accept=sc.nextInt();
System.out.println();
if(accept==1)
{
System.out.println("I KNOW YOU LOVE ME");
System.out.println("---------------------------It's love latter plz decode and read-------------------");
}
else if(accept==2)
{
System.out.println("----------------------------------------------------------------------------------");
System.out.println("AS YOU WISH");
System.out.println();
System.out.println("BE HAPPY ALWAYS MY LOVE");
System.out.println();
System.out.println(" BY BY BY BY ");
System.out.println(" ------------------------------------code is end----------------------------------");
}


//Prposal accpted or not code ending

}


}

else
{
System.out.println("----------------------------------------------------------------------------------");
System.out.println();
System.out.println("----------------------you Can't see our Love Percentage---------------------------");
System.out.println();
System.out.println("------------------------You cant't access other code------------------------------");
System.out.println();
System.out.println("---------------------------------Thank You----------------------------------------");
System.out.println();
System.out.println("----------------------------------------------------------------------------------");
}

}

































}
}
