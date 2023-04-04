import java.util.*;
public class CountingSort{
	public static void main(String[] args){
		int[] arr = {1,2,4,0,3,2,4};
		int k = 5;
		int n = 7;
		countingSort(arr,n,k);
		System.out.print(Arrays.toString(arr));
	}
	static void countingSort(int[] arr, int n, int k){
		int[] count = new int[k];
		for(int i = 0; i < n; i++){
			count[arr[i]]++;
		}
		for(int i = 1; i < k; i++){
			count[i] += count[i-1];
		}
		int[] output = new int[n];
		for(int i = n-1; i >= 0; --i){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i = 0; i < n; i++){
			arr[i] = output[i];
		}
	} 
}