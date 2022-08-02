package Main15;

import java.util.Scanner;

public class Main1565001 {
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		dfs(1, 0);
		System.out.print(sb);

	}

	public static void dfs(int at, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}

}
