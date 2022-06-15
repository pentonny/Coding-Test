import java.util.Scanner;
import java.math.BigInteger;
public class Main10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		
		A = A.add(B);
		
		System.out.println(A.toString());
	}

}
