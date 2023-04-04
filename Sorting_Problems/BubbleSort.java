import java.util.*;

public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		boolean isSwapped;
		for(int i = 0; i < n-1; i++){
			isSwapped = false;
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false)
				break;
		}

		for(int x : arr){
			System.out.print(x + " ");
		}
	}
}