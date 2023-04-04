import java.util.*;
public class QuickSort{
	public static void main(String[] args){
		int arr[] = new int[]{8,8,7,9,3,10,5};
        
        int n = arr.length;
        qSortUsingLomuto(arr,0,n-1);
        // qSortUsingHoare(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
	}
	static void qSortUsingLomuto(int arr[],int l,int h){
		if(l < h){
			int p = lPartition(arr,l,h);
			qSortUsingLomuto(arr,l,p-1);
			qSortUsingLomuto(arr,p+1,h);
		}
	}
	static void qSortUsingHoare(int arr[], int l, int h){
		if(l < h){
			int p = hPartition(arr,l,h);
			qSortUsingHoare(arr,l,p);
			qSortUsingHoare(arr,p+1,h);
		}
	}
	static int lPartition(int arr[], int l, int h){
		int pivot = arr[h];
		int i = l-1;
		for(int j = l; j <= h-1; j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}
	static int hPartition(int arr[], int l, int h){
		int pivot = arr[l];
		int i = l-1,j = h+1;
		while(true){
			do{
				i++;
			}while(arr[i] < pivot);
			do{
				j--;
			}while(arr[j] > pivot);
			if(i >= j)	return j;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}