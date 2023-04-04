import java.util.*;
public class TowerOfHanoi {
	static int count = 0;
	public static void main(String[] args){
		int n = 3;
		int s=1,h=2,d=3;
		solve(s,d,h,n);
		System.out.println(count);
	}
	static void solve(int s, int d, int h, int n){
		count++;
		if(n == 1){
			System.out.println("move "+n+" from "+s+" to "+d);
			return;
		}
		solve(s,h,d,n-1);
		System.out.println("move "+n+" from "+s+" to "+d);
		solve(h,d,s,n-1);
	}
}