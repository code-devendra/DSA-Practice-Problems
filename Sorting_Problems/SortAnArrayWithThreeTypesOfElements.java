import java.util.*;
public class SortAnArrayWithThreeTypesOfElements{
	public static void main(String[] args){
		int[] arr = {0,1,1,2,0,1};
		Sort(arr);
		for(int num: arr){
			System.out.print(num + " ");
		}
	}
	static void Sort(int[] arr){
		int l = 0, mid = 0, h = arr.length-1;
		while(mid <= h){
			if(arr[mid] == 0){
				swapArr(arr,mid,l);
				l++;
				mid++;
			}else if(arr[mid] == 1){
				mid++;
			}else{
				swapArr(arr,mid,h);
				h--;
			}
		}
	}
	static void swapArr(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}