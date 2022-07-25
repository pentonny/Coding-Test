package Main14;

import java.util.Scanner;

public class Main508601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int first = sc.nextInt();
			int second = sc.nextInt();

			if (first == 0 && second == 0) {
				break;
			}
			if (second % first == 0) {
				sb.append(f);
			} else if (first % second == 0) {
				sb.append(m);
			} else {
				sb.append(n);
			}
		}
		System.out.println(sb);
	}

}
