package Main12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
public class Main14425 {
	
	static Set<String> p = new HashSet<>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		int N = stoi(st.nextToken());
		int M = stoi(st.nextToken());
		for(int i=0;i<N;i++) {
			p.add(br.readLine());
		}
		for(int i=0;i<M;i++) {
			if(p.contains(br.readLine())) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static int stoi(String s) {
		return Integer.parseInt(s);
	}
}
