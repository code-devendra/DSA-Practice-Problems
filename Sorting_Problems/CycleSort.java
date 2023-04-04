import java.util.*;
public class CycleSort{
	public static void main(String[] args){
		int[] arr = {1,9,2,8,3,7,1,9,4,5,6,7,8,3,2,4,686,4,453,222,90,11,22,55,33,88,66};
		int n = arr.length;
		cycleSortDistinct(arr,n);
		for(int num : arr)
			System.out.print(num + " ");
	}
	static void cycleSortDistinct(int[] arr, int n){
		int temp;
		int write = 0;
		for(int cycleStart = 0; cycleStart < n-1; ++cycleStart){
			int item = arr[cycleStart];
			int pos = cycleStart;
			for(int i = cycleStart+1; i < n; ++i){
				if(arr[i] < item)
					pos++;
			}
			if(pos == cycleStart)	continue;
			while(arr[pos] == item)	pos++;
			if(pos != cycleStart){
				temp = arr[pos];
				arr[pos] = item;
				item = temp;
				write++;
			}	
			while(pos != cycleStart){
				pos = cycleStart;
				for(int i = cycleStart+1; i < n; ++i){
					if(arr[i] < item)
						pos++;
				}
				while(arr[pos] == item)	pos++;
				if(arr[pos] != item){
					temp = arr[pos];
					arr[pos] = item;
					item = temp;
					write++;
				}
			}
		}
		System.out.println("Memory write is : " + write);
	}
}