package Main14;

import java.util.Scanner;

public class Main101001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] dp = new int[30][30];

		for (int i = 0; i < 30; i++) {
			dp[i][i] = 1;
			dp[i][0] = 1;
		}

		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}

		int T = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			sb.append(dp[M][N]).append('\n');
		}
		System.out.println(sb);
	}
}
