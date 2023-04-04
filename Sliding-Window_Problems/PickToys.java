import java.util.*;

public class PickToys {
	public static void main(String[] args){
		String str = "abacbcab";
		int k = 2;
		System.out.println(maxToys(str,k));
	}
	static int maxToys(String str, int k){
		HashMap<Character,Integer> myMap = new HashMap<>();
		int i = 0, j = 0;
		int ans = 1;
		while(j < str.length()){
			char ch = str.charAt(j);
			myMap.put(ch,myMap.getOrDefault(ch,0)+1);

			if(myMap.size() == k){
				ans = Math.max(ans, j-i+1);
			}else if(myMap.size() > k){
				while(myMap.size() > k){
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