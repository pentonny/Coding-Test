package Main17;
import java.util.Scanner;
public class Main1139901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//입력의 범위는 1 ~ 1000이므로 1001개의 index를 둔다.
		int[] arr = new int[1001];
		
		//Counting Sort
		while(N-- > 0) {
			arr[sc.nextInt()]++;
		}
		
		int prev = 0;
		int sum = 0;
		
		for(int i=0;i<1001;i++) {
			while(arr[i]-- >0) {
				sum += (i + prev);
				
				prev += i;
			}
		}
		System.out.println(sum);
	}

}
