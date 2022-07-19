package Main12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main1081603 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] counting = new int[20000001]; // 입력받는 수의 범위: -10,000,000 ~ 10,000,000
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			counting[Integer.parseInt(st.nextToken()) + 10000000]++;
		}
		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			sb.append(counting[Integer.parseInt(st.nextToken()) + 10000000]).append(' ');
		}
		System.out.println(sb);

	}

}
