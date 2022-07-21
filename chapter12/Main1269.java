package Main12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main1269 {
	public static HashSet<Integer> setA = new HashSet<>();
	public static Set<Integer> setB = new HashSet<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<A;i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<B;i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		int count = 0;
		for(int num:setA) {
			if(!setB.contains(num)) {
				count += 1;
			}
		}
		for(int num:setB) {
			if(!setA.contains(num)) {
				count+=1;
			}
		}
		System.out.println(count);

	}

}
