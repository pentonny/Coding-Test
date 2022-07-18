package Main001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Main1887001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] origin = new int[N];// 원본 배열
		int[] sorted = new int[N];// 정렬 할 배열
		// rank를 매길 HashMap
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			// 정렬할 배열과 원본 배열에 값을 넣어준다.
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}

		// 정렬 할 배열에 대해 정렬을 수행한다.
		Arrays.sort(sorted);

		// 정렬 된 배열을 순회하면서 map에 넣어준다.
		int rank = 0;
		for (int v : sorted) {
			/*
			 * 이 때 만약 앞선 원소가 이미 순위각 매겨졌다면 중복되면 안되므로, 원소가 중복되지 않을 때만 map에 원소와 그에 대응 되는 순위에
			 * 넣어준다
			 */
			if (!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int key : origin) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
	}

}
