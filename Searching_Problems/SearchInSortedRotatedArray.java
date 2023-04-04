import java.util.*;
public class SearchInSortedRotatedArray{
	public static void main(String[] args){
		int[] arr = {4,5,7,9,1,3};
		int l = 0;
		int h = 5;
		int x = 1;
		System.out.println(search(arr,l,h,x));

	}
	static int search(int arr[], int low, int high, int x)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int pvt = getPivot(arr,low,high);
        if(arr[pvt] == x)   return pvt;
        if(arr[pvt] <= x && x <= arr[high]){
            return binarysearch(arr,pvt+1,high,x);
        }else{
            return binarysearch(arr,low,pvt-1,x);
        }
        
    }
    static int getPivot(int arr[] , int l, int h){
        while(l < h){
            int mid = l+(h-l)/2;
            if(arr[mid] >= arr[0]){
                l = mid+1;
            }else{
                h = mid;
            }
        }
        return l;
    }
    static int binarysearch(int A[], int l, int h, int key){
        while(l<=h){
            int mid = l+(h-l)/2;
            if(A[mid] == key){
                return mid;
            }else if(A[mid] < key){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return -1;
    }
}