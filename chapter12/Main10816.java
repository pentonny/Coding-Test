package Main12;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main10816 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);// 이분 탐색을 하기위해 반드시 정렬되어야 한다.

		int M = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			int key = sc.nextInt();
			// upperBound와 lowerBound의 차이 값을 구한다.
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}

	public static int lowerBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;

		// lo와 hi랑 같아질 때까지 반복
		while (lo < hi) {
			int mid = (lo + hi) / 2;// 중간위치를 구한다
			/*
			 * key값이 중간 위치의 값보다 작거나 같을 경우 (중복 원소에 대해 왼쪽으로 탐색하도록 살계를 내린다
			 */
			if (key <= arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

	public static int upperBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;

		// lo가 hi랑 같아질때 까지 반복
		while (lo < hi) {
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}
