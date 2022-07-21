package Main12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main1764 {
	// 듣도 못한 사람 저장
	public static HashSet<String> hs = new HashSet<String>();

	public static ArrayList<String> ans = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 듣도 못한 사람의 수
		int N = Integer.parseInt(st.nextToken());
		// 보도 못한 사람의 수
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			// 듣도 못한 사람 저장
			hs.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			// 보도 못한 사람이 듣도 못한 사람에 있을경우 => list에 저장
			if (hs.contains(s)) {
				ans.add(s);
			}
		}
		Collections.sort(ans);
		System.out.println(ans.size());// 듣도 보도 못한 사람의 수=list 크기
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}

}
