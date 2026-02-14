package MultiThreading;

public class Test implements Runnable{
	public void run() {
//		System.out.println("Thread run function in Test class");
		System.out.println("Thread running.." +Thread.currentThread().getName());
	}
}
