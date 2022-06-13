import java.util.Scanner;
import java.util.HashSet;
public class Main3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(sc.nextInt() % 42);
		}
		sc.close();
		System.out.print(h.size());
	}

}
