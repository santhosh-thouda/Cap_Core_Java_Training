package MultiThreading1;

public class CookingJob implements Runnable{
	String dishName;
	
	CookingJob(String dishName){
		this.dishName = dishName;
	}
	
	public void run() {
		System.out.println(dishName+ " is running by : "+ Thread.currentThread().getName());
	}
}
