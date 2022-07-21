package Main13;
import java.util.Scanner;
public class Main1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x_min = Math.min(x, w-x); //x축 최소거리
		int y_min = Math.min(y, h-y); //y축 최소거리
		
		//x와 y축 최소거리 중 가장 작은 길
		System.out.println(Math.min(x_min, y_min));
	}

}
