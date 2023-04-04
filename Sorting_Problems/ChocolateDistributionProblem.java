import java.util.*;
public class ChocolateDistributionProblem{
	public static void main(String[] args){
		int arr[] = {3,4,1,9,56,7,9,12};
		int m = 9;
		System.out.print(MinDistribution(arr,m));
	}
	static int MinDistribution(int[] arr, int m){
		if(m > arr.length)	return -1;
		Arrays.sort(arr);
		int res = arr[m-1]-arr[0];
		for(int i = 1; i <= arr.length-m; i++){
			res = Math.min(res,arr[i+m-1]-arr[i]);
		}
		return res;
	}
}