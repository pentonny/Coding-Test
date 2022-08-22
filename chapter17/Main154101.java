package Main17;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main154101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int sum = Integer.MAX_VALUE;
		StringTokenizer sub = new StringTokenizer(sc.nextLine(), "-");

		while (sub.hasMoreTokens()) {
			int temp = 0;

			StringTokenizer addition = new StringTokenizer(sub.nextToken(), "+");

			while (addition.hasMoreTokens()) {
				temp += Integer.parseInt(addition.nextToken());
			}
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
}
