package Main14;

import java.util.Scanner;

public class Main5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int first = sc.nextInt();
			int second = sc.nextInt();

			if (first == 0 && second == 0)
				break;
			if (second % first == 0) {
				System.out.println("factor");
			} else if (first % second == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}

	}

}
