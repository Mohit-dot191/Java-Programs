
public class HeartPattern{
public static void main(String[] args){





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
}

}






