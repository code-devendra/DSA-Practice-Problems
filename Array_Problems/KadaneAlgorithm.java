import java.util.*;
public class KadaneAlgorithm{
	/* This solution takes big O(n) time */
	public static void main(String[] args){
		int[] arr = {-3,8,-2,4,-5,6};
		int maxEnding = arr[0];
		int result = arr[0];
		for(int i = 1; i < arr.length; i++){
				maxEnding = Math.max(arr[i] + maxEnding,arr[i]);
				result = Math.max(maxEnding,result);
		}
		System.out.println(result);
		
	}
}