import java.util.Scanner;
public class Main2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		A =Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B =Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A :B);
	}

}