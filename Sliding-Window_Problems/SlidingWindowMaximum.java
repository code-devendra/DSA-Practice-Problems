import java.util.*;

public class SlidingWindowMaximum{
	public static void main(String[] args){
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
	}

	static int[] maxSlidingWindow(int[] arr, int k){
		int n = arr.length;
		int[] res = new int[n-k+1];
		int res_idx = 0;

		Deque<Integer> q = new ArrayDeque<>();

		int i = 0, j = 0;

		while(j < n){
			if(q.isEmpty())
				q.offer(arr[j]);
			else{
				while(!q.isEmpty() && q.peekLast() < arr[j]){
					q.pollLast();
				}
				q.offer(arr[j]);
			}
			if(j-i+1 < k)	j++;
			else if(j-i+1 == k){
				res[res_idx++] = q.peek();
				if(arr[i] == q.peek())
					q.pollFirst();
				i++;
				j++;
			}
		}

		return res;
	}
}