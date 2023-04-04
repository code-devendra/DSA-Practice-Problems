import java.util.*;

public class GenerateParentheses {
	public static void main(String[] args){
		int n = 2;
		System.out.println(generateParenthesis(n));
	}
	static List<String> generateParenthesis(int n) {
        int open = n;
        int close = n;
        String op = "";
        ArrayList<String> pare = new ArrayList<>();
        solve(open, close, op, pare);
        return pare;
    }
    static void solve(int open, int close, String op,List<String> pare){
        if(open == 0 && close == 0){
            pare.add(op);
            return;
        }
        if(open != 0){
            String op1 = op;
            op1 += "(";
            solve(open-1,close,op1,pare);
        }
        if(close > open){
            String op2 = op;
            op2 += ")";
            solve(open,close-1,op2,pare);
        }
        return;
    }
}