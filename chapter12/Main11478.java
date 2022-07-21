package Main12;
import java.util.Scanner;
import java.util.HashSet;
public class Main11478 {
public static HashSet<String> list = new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(!list.contains(s.substring(i,j))) {
					list.add(s.substring(i,j));
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()+"\n");
		System.out.println(sb);
	}

}
