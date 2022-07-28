package Main14;

import java.util.Scanner;
import java.util.Arrays;

public class Main2981 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);// 정렬

		int gcdVal = arr[1] - arr[0];// 음수가 되지 않도록 큰수에서 작은수로 빼준다.

		for (int i = 2; i < N; i++) {
			// 직전의 최대 공약수와 다음 수(arr[i] - arr[i - 1])의 최대공약수를 갱신
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}
		// 최대공약수의 약수들 찾기
		for (int i = 2; i <= gcdVal; i++) {
			// i가 최대공약수의 약수라면 출력
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
