package MultiThreading;

public class TestMain {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		t1.run();
		t2.run();
		t3.start();
		t4.start();
		
		Thread t5 = new Thread(t2);
		t5.start();

		Thread t6 = new Thread(t2);
		t6.start();
	}
}
