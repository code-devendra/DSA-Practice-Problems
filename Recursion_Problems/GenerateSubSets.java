import java.util.*;
public class GenerateSubSets{
	public static void main(String[] args){
		String ip = "abcd";
		String op = "";
		solve(ip,op);
	}
	static void solve(String inp, String op){
		if(inp.length() == 0){
			System.out.println(op);
			return;
		}
		String op1 = op;
		String op2 = op + inp.substring(0,1);

		solve(inp.substring(1,inp.length()),op1);
		solve(inp.substring(1,inp.length()),op2);
		return;
	}
}