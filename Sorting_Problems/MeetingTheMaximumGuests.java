import java.util.*;
public class MeetingTheMaximumGuests{
	public static void main(String[] args){
		int arr[] = {800,700,600,500};
		int dpr[] = {840,820,830,530};
		System.out.println(maxGuest(arr,dpr));
	}
	static int maxGuest(int[] arr, int[] dpr){
		int n = arr.length;
		Arrays.sort(arr);
		Arrays.sort(dpr);
		int i = 1,j = 0, res = 1, count = 1;
		while(i < n && j < n){
			if(arr[i] <= dpr[j]){
				count++;
				i++;
			}else{
				count--;
				j++;
			}
			res = Math.max(res,count);
		}
		return res;
	}
}