import java.util.Scanner;
public class Main2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //하루에 올라갈수있는
		int B = sc.nextInt(); //밤에 떨어어지는
		int V = sc.nextInt(); //총 길이
		
		int day = (V - B) / (A - B);
		
		if((V - B) % (A - B)!=0) {
			day++;
		}
		System.out.println(day);
	}
}
