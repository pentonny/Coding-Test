package Main17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main154102 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE;
		String[] sub = br.readLine().split("-");

		for (int i = 0; i < sub.length; i++) {
			int temp = 0;

			String[] addition = sub[i].split("\\+");

			for (int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
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
