import java.util.*;
public class RadixSort{
	public static void main(String[] args){
		int[] arr = {1095,29,41,0,3,2847,486};
		int n = 7;
		RadixSort(arr,n);
		System.out.print(Arrays.toString(arr));
	}
	static void RadixSort(int[] arr, int n){
		int mx = arr[0];
		for(int i = 1; i < n; i++)
			mx = Math.max(mx,arr[i]);
		for(int exp = 1; mx/exp > 0; exp *= 10){
			countingSort(arr, n, exp);
		}
	}
	static void countingSort(int[] arr, int n, int exp){
		int[] count = new int[10];
		for(int i = 0; i < n; i++){
			count[(arr[i]/exp)%10]++;
		}
		for(int i = 1; i < 10; i++){
			count[i] += count[i-1];
		}
		int[] output = new int[n];
		for(int i = n-1; i >= 0; --i){
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i = 0; i < n; i++){
			arr[i] = output[i];
		}
	} 
}