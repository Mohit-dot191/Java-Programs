package oops;

public abstract interface Reading{
	abstract void read();
}

 public abstract interface Youtuber{
	abstract void makeVideo();
}

public abstract interface Playing{
	abstract void play();
}
 public class MainMethod implements Reading,Youtuber,Playing{
	
	public static void main(String[] args) {
		
	MainMethod obj = new MainMethod();
	obj.read();
	obj.makeVideo();
	obj.play();
	}

public void read()
{
	System.out.println("Student read the books");
}

public void makeVideo()
{
	System.out.println("Student make a youtube video");
}
public void play()
{
	System.out.println("Student play games");
}
}
