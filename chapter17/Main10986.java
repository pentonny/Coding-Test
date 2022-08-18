package Main17;
import java.util.Scanner;
public class Main10986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int sum=0;
		int arr[] = new int[M];
		for(int i=0;i<N;i++) {
			sum = (sum + sc.nextInt()) % M;
			arr[sum]++;
		}
		long ans = arr[0];
		for(int i=0;i<M;i++) {
			ans +=(long) arr[i] * (arr[i]-1)/2;
		}
		System.out.println(ans);
	}

}
