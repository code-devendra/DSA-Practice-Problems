import java.util.*;
public class FindFirstAndLastOccurance{
	public static void main(String[] args){
		int[] arr = {1};
		int n = arr.length;
		int result = firstOcc(arr,0,n-1,1);
		System.out.println(result);
	}

	public static int firstOcc(int arr[], int low, int high, int x){
		while(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] > x){
				high = mid-1;
			}else if(arr[mid] < x){
				low = mid+1;
			}else{
				if(mid == 0 || arr[mid-1] != arr[mid])	return mid;
				else high = mid-1;
			}
		}	
		return -1;
	}
	public static int lastOcc(int arr[], int low, int high, int x){
		if(low > high) return -1;
		int mid = (low + high)/2;
		if(arr[mid] > x){
			return lastOcc(arr,low,mid-1,x);
		}else if(arr[mid] < x){
			return lastOcc(arr,mid+1,high,x);
		}else{
			if(mid == arr.length-1 || arr[mid+1] != arr[mid])	return mid;
			else return lastOcc(arr,mid+1,high,x);
		}
	}
}