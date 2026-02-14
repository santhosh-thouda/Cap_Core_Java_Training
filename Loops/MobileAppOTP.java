package Loops;

import java.util.Scanner;

public class MobileAppOTP {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int attempts = 1;
		int otp;
		int correctOtp = 987654;
		while(attempts <= 3) {
			System.out.print("Enter OTP: ");
			otp = sc.nextInt();
			
			if(otp != correctOtp) {
				System.out.println("Incorrect OTP");
				System.out.println("Remaining attempts "+(3-attempts));
				attempts++;
			}
			else {
				System.out.println("Correct OTP");
				break;
			}
		}
	}
}
