package Array;

public class BookIdExists {
	static boolean exists(int arr[], int id) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == id)return true;
		}
		return false;
	}
	
	static void studentMarks(int marks[]) {
		for(int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]+ " ");
		}
	}
	
	public static void main(String[]args) {
		int[] arr = {8,6,5,4,3,2,9};
		int id = 8;
		boolean check = exists(arr, id);
		System.out.println(check ? "Book ID exists" : "Book Id doesn't exist");
		
		System.out.println();
		
		int marks[] = {98,73,81,90,32};
		System.out.println("Students marks");
		studentMarks(marks);
	}
}
