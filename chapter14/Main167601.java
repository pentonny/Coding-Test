package Main14;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main167601 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int count = 0;

		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);

	}

}
