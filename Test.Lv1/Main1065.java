import java.util.Scanner;
public class Main1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print(arithmetic_sequence(sc.nextInt()));
		sc.close();
	}
	public static int arithmetic_sequence(int num) {
		int count =0;
		if(num <100) {
			return num;
		}
		else {
			count = 99;
			
			for(int i=100;i<=num;i++) {
				int hun = i / 100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hun - ten) == (ten-one)) {
					count++;
				}
			}
		}
		return count;
	}
}
