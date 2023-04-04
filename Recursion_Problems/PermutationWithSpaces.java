import java.util.*;
public class PermutationWithSpaces {
	public static void main(String[] args){
		String inp = "abcdefg";
		String op = "";
		op += inp.substring(0,1);
		inp = inp.substring(1);
		solve(inp,op);
	}
	static void solve(String inp, String op){
		if(inp.length() == 0){
			System.out.println(op);
			return;
		}
		String op1 = op + "_" + inp.substring(0,1);
		String op2 = op + inp.substring(0,1);
		inp = inp.substring(1);

		solve(inp,op1);
		solve(inp,op2);
		return;
	}
}