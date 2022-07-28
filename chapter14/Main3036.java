package Main14;

import java.util.Scanner;

public class Main3036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 첫번째 링
		int firstRing = sc.nextInt();

		for (int i = 1; i < N; i++) {
			int otherRing = sc.nextInt();

			// 기약분수를 만들기 위한 최대공약수 찾기
			int gcd = gcd(firstRing, otherRing);

			// 분모와 분자를 최대공약수로 나뉘주기
			System.out.println((firstRing / gcd) + "/" + (otherRing / gcd));
		}
	}

	// 최개공약수 메소드
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
