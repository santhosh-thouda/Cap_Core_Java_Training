package Operators;

public class ProductQuality {
	public static void main(String[]args) {
		int weight = 450;
		int qualityScore = 90;
		boolean qualityCheck = ((weight >= 450 && weight <=550) && qualityScore >= 8);
		System.out.println(qualityCheck ? "Accepted" : "Rejected");
	}
}
