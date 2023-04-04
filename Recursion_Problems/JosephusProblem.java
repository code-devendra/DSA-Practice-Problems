import java.util.*;
public class JosephusProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(josephus(n,k));
	}
	public static int josephus(int n, int k)
    {
        return jose(n , k)+1;
    }
    public static int jose(int n , int k){
        if(n == 1){
            return 0;
        }else{
            return (jose(n-1,k)+k)%n;
        }
    }
}