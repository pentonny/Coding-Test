package Main18;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main1077301 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int top = -1;
		
		int K = Integer.parseInt(br.readLine());
		int arr[] = new int[K];
		
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num ==0) {
				top--;
			}
			else {
				top++;
				arr[top] = num;
			}
		}
		int sum = 0;
		for(int i=0; i<=top; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
