import java.util.*;
public class SquareRoot{
	public static void main(String[] args){
		long x = 50;
		System.out.println(floorOfSqrt(x));
	}
	public static long floorOfSqrt(long x){
		if(x==0)    return (long)0;
		long low = 1;
		long high = x;
		long ans = -1;
		while(low <= high){
		    long mid = (low+high)/2;
		    long mSqrt = mid*mid;
		    if(mSqrt == x)  return mid;
		    else if(mSqrt > x)  high = mid-1;
		    else{
		        low = mid+1;
		        ans = mid;
		    }
		}
		return ans;
	}
}