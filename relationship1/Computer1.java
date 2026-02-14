package relationship1;

public class Computer1 {
	private Ram1 ram;
	private Cpu1 cpu;
	
	public Computer1(){
		ram = new Ram1(16);
		cpu = new Cpu1(8);
	}
	
	public int getRam(){
		return ram.getRam();
	}
	
	public int getCpu() {
		return cpu.getCpu();
	}
}
