import java.util.Scanner;
public class Main1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //불변비용
		int B = sc.nextInt(); //가변비용
		int C = sc.nextInt(); //상품가격
		
		if(C <= B) {
			System.out.print("-1");
		}
		else {
			System.out.println((A/(C-B))+1);
		}
	}

}
