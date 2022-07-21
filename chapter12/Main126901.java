package Main12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main126901 {
	public static HashSet<Integer> setA = new HashSet<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		// A 입력 받기
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}

		// b 입력 받기
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (setA.contains(num)) { // 만약 있는 값이라면
				setA.remove(num); // 해당 값을 제거해주고
			} else { // 없다면
				setA.add(num); // 해당 값을 추가해준다.
			}
		}
		// 해쉬셋의 크기 출력;
		System.out.println(setA.size());
	}

}
