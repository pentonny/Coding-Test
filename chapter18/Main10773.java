package Main18;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
public class Main10773 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int K = Integer.parseInt(br.readLine());
		
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}
		int sum = 0;
		
		for(int o : stack) {
			sum += o;
		}
		System.out.println(sum);

	}

}
