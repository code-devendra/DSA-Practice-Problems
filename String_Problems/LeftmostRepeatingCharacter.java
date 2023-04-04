import java.util.*;

public class LeftmostRepeatingCharacter {
	static final int CHAR = 256;

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("Index of LeftmostRepeatingCharacter is : " + indexOfRepeatingChar(str));
	}

	static int indexOfRepeatingChar(String str) {
		boolean[] visited = new boolean[CHAR];
		int res = -1;
		for(int i = str.length()-1; i >= 0; i--) {
			if(visited[str.charAt(i)])
				res = i;
			else  
				visited[str.charAt(i)] = true;
		}
		return res;
	}
}
