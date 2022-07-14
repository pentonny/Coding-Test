package Main001;
import java.util.Scanner;
import java.util.Arrays;
public class Main1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
