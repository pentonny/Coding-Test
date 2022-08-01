package Main14;

import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main9375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();// 테스트 케이스

		while (T-- > 0) {

			HashMap<String, Integer> hm = new HashMap<>();// <종류,개수>

			int N = sc.nextInt();// 입력받는 옷의 개수

			while (N-- > 0) {
				sc.next(); // 옷 이름은 필요 없음
				String kind = sc.next(); // 옷 종류
				/*
				 * 해당 종류의 옷이 해시맵에 있을 경우 해시맵에 저장되었던 해당 종류 개수를 +1 증가시킨다
				 * 
				 * 해당 종류와 옷이 해시맵에 있을 경우 해당 종휴와 개수 1을 넣는디.
				 */
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} else {
					hm.put(kind, 1);
				}
			}
			int result = 1;

			/*
			 * 안 입는 경우를 고려하여 각 종류별 옷의 개수에 +1 해준 값을 곱해주어야한다.
			 */
			for (int val : hm.values()) {
				result *= (val + 1);
			}
			System.out.println(result - 1);
		}
	}

}
