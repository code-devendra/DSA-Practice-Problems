import java.util.*;
public class TrappingRainWater{
	public static void main(String[] args){
		int[] arr = {3,1,0};
		int n = arr.length;
		System.out.println(getWater(arr,n));
	}

	/* This is a naive solution that takes theta (n*n) time
	public static int getWater(int arr[] , int n){
		int water = 0;
		for(int i = 1; i < n-1; i++){
			int leftHight = arr[i];
			for(int j = 0; j < i; j++){
				leftHight = Math.max(leftHight,arr[j]);
			}
			int rigthHight = arr[i];
			for(int j = i+1; j < n; j++){
				rigthHight = Math.max(rigthHight,arr[j]);
			}
			water += Math.min(leftHight,rigthHight) - arr[i];
		}
		return water;
	}
	*/

	/* This is an efficient solution that takes theta (n) time and take theta (n) space */
	public static int getWater(int arr[] , int n){
		int water = 0;
		int[] leftHeight = new int[n];
		int[] rigthHeigth = new int[n];
		leftHeight[0] = arr[0];
		for(int i = 1; i < n; i++){
			leftHeight[i] = Math.max(leftHeight[i-1],arr[i]);
		}
		rigthHeigth[n-1] = arr[n-1];
		for(int i = n-2;i >= 0; i--){
			rigthHeigth[i] = Math.max(rigthHeigth[i+1],arr[i]);
		}
		for(int i = 1; i < n-1; i++){
			water += Math.min(leftHeight[i],rigthHeigth[i]) - arr[i];
		}
		return water;
	}
}