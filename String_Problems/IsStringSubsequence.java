import java.util.*;
public class IsStringSubsequence {
	public static void main (String[] args) {
		String str1 = "ABCDE";
		String str2 = "AED";
		System.out.println(isSubsequence(str1,str2,str1.length(),str2.length()));
	}
	static boolean isSubsequence(String str1, String str2, int n, int m) {
		if(n < m)	return false;
		int j = 0;
		for(int i = 0; i < n && j < m; i++){
			if(str1.charAt(i) == str2.charAt(j))
				j++;
		}
		return (j == m);
	}
}