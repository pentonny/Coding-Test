package Main14;

import java.util.Scanner;

public class Main1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int d = gcd(a, b);

			sb.append(a * b / d).append('\n');
		}
		System.out.println(sb);
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
