package Main13;

import java.util.Scanner;

public class Main4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			if (x == 0 && y == 0 && x == 0)
				break;

			if ((x * x + y * y) == z * z) {
				System.out.println("right");
			} else if (x * x == (y * y + z * z)) {
				System.out.println("right");
			} else if (y * y == (z * z + x * x)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}

}
