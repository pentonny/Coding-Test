package Main14;

import java.util.Scanner;

public class Main1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (T-- > 0) {
			int N = sc.nextInt();
			max = N > max ? N : max;
			min = N < min ? N : min;
		}
		System.out.println(max * min);
	}

}
