import java.util.*;
public class MedianOfRowWiseSortedMatrix {

	static int countSmallerThanEqualMid(int[] A, int mid, int n){
		int low = 0, high = n-1;
		while(low <= high){
			int md = (low+high)>>1;
			if(A[md] <= mid){
				low = md + 1;
			}else
				high = md -1;
		}
		return low;
	}

	static int findMedian(int[][] arr){
		int low = 1, high = 1000000000;
		int m = arr.length, n = arr[0].length;
		while(low <= high){
			int mid = (low+high)>>1;
			int cnt = 0;
			for(int i = 0; i < m; i++){
				cnt += countSmallerThanEqualMid(arr[i],mid,n);
			}
			if(cnt <= (n*m)/2){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return low;
	}

	public static void main(String[] args){
    	int[][] arr = {{1, 3, 8},
        	           {2, 3, 4},
        	           {1, 2, 5}};
    	System.out.println("The median of the row-wise sorted matrix is: "+ findMedian(arr));
	}
}