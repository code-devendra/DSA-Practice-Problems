import java.util.*;
public class HeapSort{
	public static void main(String[] args){
		int[] arr = {10,15,50,4,20,5,5,34,2,39,11};
		heapSort(arr);
		System.out.print(Arrays.toString(arr));
	}
	static void heapSort(int[] arr){
		buildHeap(arr);
		for(int i = arr.length-1; i >= 1; --i){
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr,i,0);
		}
	}
	static void buildHeap(int[] arr){
		int n = arr.length;
		for(int i = n/2-1; i >= 0; --i)
			heapify(arr,n,i);
	}
	static void heapify(int[] arr, int n, int i){
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l < n && arr[l] > arr[largest])
			largest = l;
		if(r < n && arr[r] > arr[largest])
			largest = r;
		if(largest != i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr,n,largest);
		}
	}
}