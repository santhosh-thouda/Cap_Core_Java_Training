package YtMOnePractice;

public class Validator {
	public static String validateSalaryData(SalaryData s) throws Exception{
		if((s.daysInMonth != 28) && (s.daysInMonth != 30) && (s.daysInMonth != 31)) {
			throw new InvalidDayException("Invalid Days");
		}
		else if(s.salary < 0 || s.salary > 1000000){
			throw new InvalidSalaryException("Invalid Salary");
		}
		else {
			return "Valid Data";
		}
	}
	
	public double getTotalSalary(SalaryData s) throws Exception{
		double res = 0.0;
		try {
			validateSalaryData(s);
			res = s.salary * s.daysInMonth;
		}
		catch(InvalidDayException e) {
			res = 0.0;
		}
		catch(InvalidSalaryException e) {
			res = 0.0;
		}
		catch(Exception e) {
			res = 0.0;
		}
		return res;
	}
}
