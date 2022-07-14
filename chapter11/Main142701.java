package Main001;
import java.util.Scanner;
public class Main142701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] counting= new int[10];
		
		int N =sc.nextInt();
		
		while(N!=0) {
			counting[N%10]++;
			N/=10;
		}
		for(int i=9;i>=0;i--) {
			while (counting[i]-- >0) {
				System.out.print(i);
			}
		}
	}

}
