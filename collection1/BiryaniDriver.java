package collection1;

public class BiryaniDriver {
	public static void main(String[] args) {
		BiryaniOperations bo = new BiryaniOperations();
		
		bo.addBiryani(new Biryani(4, "Kolkata", 180, "Aloo"));
		bo.addBiryani(new Biryani(8, "Sindhi", 160, "Dry"));
		bo.addBiryani(new Biryani(2, "Muradabadi", 150, "Masala"));
		bo.addBiryani(new Biryani(7, "Thalassery", 220, "Malabar"));
		bo.addBiryani(new Biryani(6, "Dindigul", 210, "Pepper"));
		bo.addBiryani(new Biryani(3, "Lucknow", 190, "Tasty"));
		bo.addBiryani(new Biryani(5, "Ambur", 170, "Spicy"));
		bo.addBiryani(new Biryani(1, "Hyderabadi", 200, "Dum"));
		
        bo.displayBiryanis();
        System.out.println();
        
		bo.biryaniSortById();
		System.out.println();
		
		bo.biryaniSortByPrice();
		System.out.println();
	}
}
