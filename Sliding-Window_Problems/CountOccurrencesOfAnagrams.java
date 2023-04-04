import java.util.*;
public class CountOccurrencesOfAnagrams{
	public static void main(String[] args){
		String str = "aabaababa";
		String ptr = "aaba";
		System.out.println(countAnagrams(str,ptr));
	}
	static int countAnagrams(String str, String ptr){
		int n = str.length();
		int k = ptr.length();

		Map<Character, Integer> charCount = new HashMap<>();

		for(int i = 0; i < k; i++){
			char c = ptr.charAt(i);
			if(charCount.containsKey(c)){
				charCount.put(c,charCount.get(c)+1);
			}else{
				charCount.put(c,1);
			}
		}
		int count = charCount.size();
		int i = 0, j = 0;
		int ans = 0;

		while(j < n){
			char c = str.charAt(j);
			if(charCount.containsKey(c)){
				charCount.put(c,charCount.get(c)-1);
			}
			if(charCount.get(c) == 0){
				count--;
			}
			if(j-i+1 < k){
				j++;
			}else if(j-i+1 == k){
				char ch = str.charAt(i);
				if(count == 0)
					ans++;
				if(charCount.containsKey(ch)){
					charCount.put(ch,charCount.get(ch)+1);
				}
				if(charCount.get(ch) == 1){
					count++;
				}
				i++;
				j++;
			}
		}
		return ans;
	}
}