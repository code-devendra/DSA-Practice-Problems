import java.util.*;

public class InsertionSort{
	public static void main(String[] args){
		int[] arr = {10,2,9,4,5};
		int n = arr.length;
		for(int i = 1; i < n; i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}

		for(int x : arr){
			System.out.print(x + " ");
		}
	}
}