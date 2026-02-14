package Array;


public class AscendingSort {
	
	static void merge(int arr[], int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		int k = 0;
		int[] newArr = new int[right - left + 1];
		while(i<= mid && j<=right) {
			if(arr[i] <= arr[j]) {
				newArr[k++] = arr[i++]; 
			}
			else {
				newArr[k++] = arr[j++];
			}
		}
		while(i <= mid) {
			newArr[k++] = arr[i++];
		}
		while(j <= right) {
			newArr[k++] = arr[j++];
		}
		
		for(int x = 0; x<newArr.length; x++) {
			arr[left+x] = newArr[x];
		}
	}
	
	static void mergeSort(int arr[], int left, int right) {
		int mid = (left + right)/2;
		if(left >= right)return;
		mergeSort(arr,left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr, left, mid, right);
	}
	
	public static void main(String[]args) {
		int[] arr = {8,6,5,4,3,2,9};
		int n = arr.length;
		mergeSort(arr, 0, n-1);
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
}
