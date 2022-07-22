package Main13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main415302 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());

			if (x == 0 && y == 0 && z == 0)
				break;

			if ((x * x + y * y) == z * z) {
				sb.append("right").append('\n');
			} else if (x * x == (y * y + z * z)) {
				sb.append("right").append('\n');
			} else if (y * y == (x * x + z * z)) {
				sb.append("right").append('\n');
			} else {
				sb.append("wrong").append('\n');
			}
		}
		System.out.println(sb);
	}

}
