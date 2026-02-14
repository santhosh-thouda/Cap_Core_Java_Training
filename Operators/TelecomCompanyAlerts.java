package Operators;

public class TelecomCompanyAlerts {
	public static void main(String[]args) {
		double dailyDataLimit = 2.0;
		double dataUsed = 1.5;
		boolean sendAlertOrNot = dataUsed >= dailyDataLimit * 0.9;
		System.out.println(sendAlertOrNot ? "Alert" : "No Alert");
	}
}
