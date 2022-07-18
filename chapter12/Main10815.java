package Main12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main10815 {
	static int[] arr;
	static int[] comp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 숫자카드 개수N
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];

		// 상근이가 가지고있는 숫자 카드들
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// M입력 받기
		int M = Integer.parseInt(br.readLine());
		// 이진탐색을 위한 오름차순 정렬
		Arrays.sort(arr);
		// 비교할 수 탐색
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int result = BinarySearch(Integer.parseInt(st.nextToken()));
			if (result != -1) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}

	public static int BinarySearch(int target) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] < target) {
				left = mid + 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
