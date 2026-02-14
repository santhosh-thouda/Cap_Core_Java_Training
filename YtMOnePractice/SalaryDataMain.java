package YtMOnePractice;

public class SalaryDataMain {
	public static void main(String[] args) throws Exception{
		SalaryData sd = new SalaryData("Steve", 30, 10000);
		Validator v = new Validator();
		
		String ans = v.validateSalaryData(sd);
		double sal = v.getTotalSalary(sd);
		
		System.out.println(ans);
		System.out.println(sal);
	}
}
