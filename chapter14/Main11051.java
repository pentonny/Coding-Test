package Main14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main11051 {
	public static final int div = 10007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println((fac(N) * mod_inverse((fac(N - K) * fac(K)) % div, div - 2)) % div);

	}

	static int fac(int N) {
		if (N == 0) {
			return 1;
		}
		return N * fac(N - 1);
	}

	static int mod_inverse(int a, int p) {
		int ret = 1;
		while (p > 0) {
			if (p % 2 == 1) {
				ret *= a;
				p--;
				ret %= div;
			}
			a *= a;
			a %= div;
			p >>>= 1; // p = p/2 라 같음
		}
		return ret;
	}

}
