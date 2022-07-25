package Main14;

import java.util.Scanner;

public class Main260901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

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
