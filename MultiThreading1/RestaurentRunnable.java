package MultiThreading1;

public class RestaurentRunnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new CookingJob("Pasta"));
		Thread t2 = new Thread(new CookingJob("Maggi"));
		Thread t3 = new Thread(new CookingJob("Manchirian"));
		Thread t4 = new Thread(new CookingJob("Noodles"));
		Thread t5 = new Thread(new CookingJob("Fried Rice"));
		
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
