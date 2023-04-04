import java.util.*;
public class RotateArray{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7};
		int k = 5;
		rotateArraySolutionThree(arr,k);
		for(int num:arr)
			System.out.print(num + " ");
	}
	static void rotateArraySolutionOne(int[] arr, int k){ //Space is O(n) and time is O(n).
		if (arr == null || arr.length==0 || k < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		if(k > arr.length)
			k = k % arr.length;
		int[] res = new int[arr.length];
		for(int i = 0; i < k; i++){
			res[i] = arr[arr.length-k+i];
		}
		int j = 0;
		for(int i = k; i < arr.length; i++){
			res[i] = arr[j++];
		}
		System.arraycopy(res,0,arr,0,arr.length); //Copy result array into original array
	}
	static void rotateArraySolutionTwo(int[] arr, int k){ // This solution is like a bubble sort. Space is O(1) and time is O(n*k).
		if (arr == null || arr.length==0 || k < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		if(k > arr.length)
			k = k % arr.length;
		for(int i = 0; i < k; i++){
			for(int j = arr.length-1; j > 0; --j){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
	}
	static void rotateArraySolutionThree(int[] arr, int k){ //Space is O(1) and time is O(n).
		if (arr == null || arr.length==0 || k < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
		if(k > arr.length)
			k %= arr.length;
		reverseArray(arr,0,arr.length-k-1);
		reverseArray(arr,arr.length-k,arr.length-1);
		reverseArray(arr,0,arr.length-1);
	}
	static void reverseArray(int arr[], int l, int r){
		while(l < r){
			int temp = arr[r];
			arr[r--] = arr[l];
			arr[l++] = temp;
		}
	}
}