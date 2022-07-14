package Main001;

import java.util.Scanner;
import java.util.Arrays;

public class Main11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			// 위치주의
			arr[i][1] = sc.nextInt();
			arr[i][0] = sc.nextInt();
		}
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			// 위치주의
			sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
		}
		System.out.println(sb);
	}

}
