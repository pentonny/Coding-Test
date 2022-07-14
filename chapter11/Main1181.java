package Main001;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];

		sc.nextLine(); // 개행버림

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어가 같지 않을 경우
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				// 그 외의 경우
				else {
					return s1.length() - s2.length();
				}
			}
		});

		System.out.println(arr[0]);
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}

}
