import java.util.Scanner;
public class Main1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int count = 0;
		
		for(int i =0;i<A;i++) {
			boolean isPrime = true;
			
			int num = sc.nextInt();
			
			if(num==1) {
				continue;
			}
			for(int j=2;j<=Math.sqrt(num);j++) {
				if(num%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}

}
