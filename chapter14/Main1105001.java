package Main14;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main1105001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println(BC(N, K));
	}

	static int BC(int N, int K) {
		if (N == K || K == 0) {
			return 1;
		}
		return BC(N - 1, K - 1) + BC(N - 1, K);
	}

}
