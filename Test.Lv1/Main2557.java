import java.util.Scanner;
public class Main2557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextInt() *sc.nextInt());
		String str = Integer.toString(value);
		sc.close();
		
		for(int i=0; i <10; i++) {
			int count =0;
			for(int j=0; j< str.length(); j++) {
				if((str.charAt(j)- '0') ==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
