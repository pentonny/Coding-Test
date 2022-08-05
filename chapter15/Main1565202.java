package Main15;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main1565202 {
	public static int N,M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		dfs(1,0);
		System.out.println(sb);
	}
	public static void dfs(int at,int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=at;i<=N;i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}

}