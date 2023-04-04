import java.util.*;
public class MinimumDifferenceInArray{
	public static void main(String[] args){
		int arr[] = {10,3,20,12};
		System.out.print(minDifference(arr));
	}
	static int minDifference(int[] arr){
		int res = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++){
			res = Math.min(res,arr[i]-arr[i-1]);
		}
		return res;
	}
}