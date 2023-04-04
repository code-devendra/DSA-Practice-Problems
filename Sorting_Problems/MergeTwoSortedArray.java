import java.util.*;

public class MergeTwoSortedArray{
	public static void main(String[] args){
		int arr1[] = {3,5,7,9,13};
		int arr2[] = {1,4,6,8};
		int m = 5,n = 4;
		merge(arr1,arr2,m,n);
	}
	static void merge(int a[], int b[], int m, int n){
    
        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]<b[j])
                System.out.print(a[i++]+" ");
            else
                System.out.print(b[j++]+" ");
        }
        while(i<m)
            System.out.print(a[i++]+" ");
        while(j<n)
            System.out.print(b[j++]+" ");    
    }
}