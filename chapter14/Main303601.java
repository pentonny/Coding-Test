package Main14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main303601 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(br.readLine());

		int firstRing = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			int otherRing = Integer.parseInt(st.nextToken());

			int gcd = gcd(firstRing, otherRing);

			System.out.println((firstRing / gcd) + "/" + (otherRing / gcd));
		}
	}

	static int gcd(int a, int b) {
		int r;

		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}
