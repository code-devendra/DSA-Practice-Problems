/* Print N-bit binary numbers having more 1’s than 0’s for any prefix */

import java.util.*;

public class NBitBinaryNumbers {
	public static void main(String[] args){
		int n = 4;
		System.out.println(nBitBinaryNumbers(n));
	}
	static List<String> nBitBinaryNumbers(int n) {
        int ones = 0;
        int zeros = 0;
        String op = "";
        ArrayList<String> pare = new ArrayList<>();
        solve(ones, zeros, op, pare,n);
        return pare;
    }
    static void solve(int ones, int zeros, String op, List<String> pare, int n){
        if(n == 0){
            pare.add(op);
            return;
        }
        String op1 = op;
        op1 += "1";
        String op2 = op;
        op2 += "0";
        solve(ones+1,zeros,op1,pare,n-1);
        if(ones>zeros){
            solve(ones,zeros+1,op2,pare,n-1);
        }
        return;
    }
}