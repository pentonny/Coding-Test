package Main14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main298101 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		int gcdVal = arr[1] - arr[0];
		for (int i = 2; i < N; i++) {
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}

		for (int i = 2; i <= gcdVal; i++) {
			if (gcdVal % i == 0) {
				System.out.println(i + " ");
			}
		}

	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
