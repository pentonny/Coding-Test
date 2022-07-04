import java.util.Scanner;
public class Main9020 {
	/* false : 소수
	 * range : 0~1000*/
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		get_prime();
		
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int N = sc.nextInt();
			int first_partition = N / 2;
			int second_partition = N/2;
			
			while (true) {
				if(!prime[first_partition]&&!prime[second_partition]) {
					System.out.println(first_partition + " " + second_partition);
					break;
				}
				first_partition--;
				second_partition++;
			}
		}
	}
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i=2;i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
	}

}
