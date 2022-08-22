package Main17;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main154103 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE;
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");

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
