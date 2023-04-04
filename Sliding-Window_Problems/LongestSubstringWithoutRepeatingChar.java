import java.util.*;

public class LongestSubstringWithoutRepeatingChar {
	public static void main(String[] args){
		String str = "aabacbebebe";
		System.out.println(longestSubstring(str));
	}
	static int longestSubstring(String str){
		HashMap<Character,Integer> myMap = new HashMap<>();
		int i = 0, j = 0;
		int ans = Integer.MIN_VALUE;
		while(j < str.length()){
			char ch = str.charAt(j);
			myMap.put(ch,myMap.getOrDefault(ch,0)+1);

			if(myMap.size() == j-i+1){
				ans = Math.max(ans, j-i+1);
			}else if(myMap.size() < j-i+1){
				while(myMap.size() < j-i+1){
					if(myMap.containsKey(str.charAt(i))){
						int freq = myMap.get(str.charAt(i));
						freq--;
						myMap.put(str.charAt(i),freq);
					}
					if(myMap.get(str.charAt(i)) == 0){
						myMap.remove(str.charAt(i));
					}
					i++;
				}
			}
			j++;
		}
		return ans;
	}
}