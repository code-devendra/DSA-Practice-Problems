import java.util.*;

public class SelectionSort{
	public static void main(String[] args){
		int[] arr = {10,2,9,4,5};
		int n = arr.length;
		int min_index;
		for(int i = 0; i < n-1; i++){
			min_index = i;
			for(int j = i+1; j < n; j++){
				if(arr[j] < arr[min_index])
					min_index = j;
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}

		for(int x : arr){
			System.out.print(x + " ");
		}
	}
}