import java.util.Scanner;
public class Main11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		sc.close();
		
		int sum = 0;
		
		for(int i =0;i<a;i++) {
			sum += b.charAt(i)-'0';
		}
		System.out.print(sum);
	}

}
