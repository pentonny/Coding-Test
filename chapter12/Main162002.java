package Main12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main162002 {
	static int stoi(String s) {
		return Integer.parseInt(s);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = stoi(st.nextToken());
		int M = stoi(st.nextToken());

		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String pocketmon = br.readLine();
			String number = Integer.toString(i + 1);
			map.put(pocketmon, number);
			map.put(number, pocketmon);
		}
		StringBuilder sb = new StringBuilder(M);
		for (int i = 0; i < M; i++) {
			sb.append(map.get(br.readLine()) + "\n");
		}
		System.out.println(sb);
	}

}
