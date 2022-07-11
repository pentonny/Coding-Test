package Main001;
import java.util.Scanner;
import java.util.Arrays;
public class Main2750Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		int[] arr =new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] =sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int val:arr) {
			System.out.println(val);
		}
	}

}
