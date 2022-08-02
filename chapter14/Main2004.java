package Main14;

import java.util.Scanner;

public class Main2004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long M = sc.nextLong();

		long count5 = five_power_n(N) - five_power_n(N - M) - five_power_n(M);
		long count2 = two_power_n(N) - two_power_n(N - M) - two_power_n(M);

		System.out.println(Math.min(count5, count2));
	}

	static long five_power_n(long num) {
		int count = 0;

		while (num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		return count;
	}

	static long two_power_n(long num) {
		int count = 0;

		while (num >= 2) {
			count += (num / 2);
			num /= 2;
		}
		return count;
	}
}
