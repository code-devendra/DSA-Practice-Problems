import java.util.*;
public class TransposeOfMatrix{
	public static void main(String[] args){
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		makeTranspose(arr);
		print(arr);
	}
	public static void makeTranspose(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr[i].length; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	public static void print(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}