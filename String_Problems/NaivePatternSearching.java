import java.util.*;
public class NaivePatternSearching {

	static void patSearchinng(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		for(int i = 0; i <= (n-m); i++) {
			int j;
			for(j = 0; j < m; j++)
				if(pat.charAt(j) != txt.charAt(i+j))
					break;
			if(j == m)
				System.out.print(i + " ");
		}
	}

	public static void main(String args[]){
	    String txt = "ABCABCD";
	    String pat="ABC";
        System.out.print("All index numbers where pattern found: ");
        patSearchinng(txt,pat);  
    } 
}