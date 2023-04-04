import java.util.*;
public class KthSmallestElement{
	public static void main(String[] args){
		int[] arr = {4,22,77,43,9,10};
		int k = 2;
		int res = kLargest(arr,6,k);
		System.out.println(res);
	}
	static int kSmallest(int[] arr, int n, int k){
		int l = 0;
		int h = n-1;
		while(l <= h){
			int p = lPartition(arr,l,h);
			if(p == k-1)	return arr[p];
			else if(p < k-1)	l = p+1;
			else h = p-1;
		}
		return -1;
	}
	static int kLargest(int[] arr, int n, int k){
		int l = 0;
		int h = n-1;
		while(l <= h){
			int p = lPartition(arr,l,h);
			if(p == n-k)	return arr[p];
			else if(p < n-k)	l = p+1;
			else h = p-1;
		}
		return -1;
	}
	static int lPartition(int[] arr, int l, int h){
		int pivot = arr[h];
		int i = l-1,j = l;
		while(j <= h-1){
			if(pivot > arr[j]){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}
		int temp = arr[i+1];
		arr[i+1] = pivot;
		arr[h] = temp;
		return i+1;
	}
}