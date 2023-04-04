import java.util.*;
public class LongestSubarrayOfSumK {
	public static void main (String[] args){
		int arr[] = {4,1,1,1,2,3,5};
		int k = 5;
		System.out.println(maxSizeSubarray(arr,k));
	}
	static int maxSizeSubarray(int[] arr, int k){
		int n = arr.length;
		int i = 0, j = 0;
		long sum = 0;
		int max_size = 0;

		while(j < n){
			sum += arr[j];
			if(sum < k)
				j++;
			else if(sum == k){
				max_size = Math.max(j-i+1,max_size);
				j++;
			}else{
				while(sum > k){
					sum -= arr[i++];
				}
				j++;
			}
		}
		return max_size;
	}
}