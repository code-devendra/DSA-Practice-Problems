/* First Negative Number in every Window of Size K */
import java.util.*;
public class FirstNegativeInWindow{
	public static void main(String[] args){
		int[] arr = {-29,-45,-11};
		int k = 1;
		printNegative(arr,k);
	}
	static void printNegative(int[] arr, int k){
		ArrayList<Integer> al = new ArrayList<>();
		int i = 0, j = 0;
		while(j < arr.length){
			if(arr[j] < 0){
				al.add(arr[j]);
			}
			if(j-i+1 < k)
				j++;
			else if(j-i+1 == k){
				if(al.size() == 0)
					System.out.println(0);
				else{
					System.out.println(al.get(0));
					if(arr[i] == al.get(0)){
						al.remove(0);
					}
				}
				i++;
				j++;
			}
		}
	}
}