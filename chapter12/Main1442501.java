package Main12;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
public class Main1442501 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<N;i++) {
			set.add(br.readLine());
		}
		int count =0;
		for(int i =0;i<M;i++) {
			String s =br.readLine();
			if(set.contains(s)) {
				count++;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(count+"\n");
		
		System.out.println(sb);
		br.close();
	}

}