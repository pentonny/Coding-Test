package Main12;

import java.util.Scanner;
import java.util.HashSet;

public class Main1147801 {
	public static HashSet<String> list = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			String A = "";
			for (int j = i; j < str.length(); j++) {
				A += str.substring(j, j + 1);
				list.add(A);
			}
		}
		System.out.println(list.size());
	}

}
