import java.util.*;
public class PascalTriangle{
	public static int fact(int n){
		int res = 1;
		for(int i = 2; i <= n; i++){
			res *= i;
		}
		return res;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter no. of rows , exact row and column : ");
		int rows = input.nextInt();
		int row = input.nextInt();
		int column = input.nextInt();
		System.out.println(printRows(rows));
		System.out.println(printRow(row));
		System.out.println(printValue(row,column));
	}

	static List<List<Integer>> printRows(int numRows){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;
	}
	static List<Integer> printRow(int row){
		int n = row - 1;
		int res = 1;
		List<Integer> result = new ArrayList<>();
		result.add(1);
		for(int i = 1; i < row; i++){
			res *= (n-i+1);
			res /= i;
			result.add(res);
		}
		return result;
	}
	static int printValue(int row, int column){
		row -= 1;
		column -= 1;
		return fact(row)/(fact(column)*fact(row-column));
	}
}