package Main14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main260903 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int d = gcd(a, b);

		System.out.println(d);
		System.out.println(a * b / d);
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;

			a = b;
			b = r;
		}
		return a;
	}

}
