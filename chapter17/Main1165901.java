package Main17;

import java.util.Scanner;

public class Main1165901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = arr[i - 1] + sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(arr[b] - arr[a - 1]);
		}
	}

}
