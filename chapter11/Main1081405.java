package Main001;

import java.util.Scanner;

public class Main1081405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// 입력되는 나이의 범위:1 ~ 200;
		StringBuilder[] p = new StringBuilder[201];
		// 객체배열의 인덱스에 각 StringBuilder 객체를 생성해준다.
		for (int i = 0; i < p.length; i++) {
			p[i] = new StringBuilder();
		}
		for (int i = 0; i < N; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			p[age].append(age).append(' ').append(name).append('\n');
		}
		StringBuilder sb = new StringBuilder();
		for (StringBuilder val : p) {
			sb.append(val);
		}
		System.out.println(sb);
	}

}
