/* Maximum Sum Subarray of size K | Sliding Window */
import java.util.*;
public class MaxSumSubarray{
	public static void main(String[] args){
		int[] arr = {1,3,6,4,8,6,2,9};
		int k = 3;
		System.out.println(maxSum(arr,k));
	}

	static int maxSum(int[] arr, int k){
		int i = 0, j = 0;
		int mx = Integer.MIN_VALUE;
		int sum = 0;
		while(j < arr.length){
			sum += arr[j];
			if(j-i+1 < k)
				j++;
			else if(j-i+1 == k){
				mx = Math.max(mx,sum);
				sum -= arr[i];
				i++;
				j++;
			}
		}
		return mx;
	}
}