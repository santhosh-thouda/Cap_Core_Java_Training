package MultiThreading1;

public class CookingTask extends Thread{
	String name;
	CookingTask(String name){
		this.name = name;
	}
	
	public void run() {
		System.out.println(name+" is prepared by " +Thread.currentThread().getName());
	}
}
