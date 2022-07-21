package Main13;
import java.util.Scanner;
public class Main3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] coord_1 = {sc.nextInt(),sc.nextInt()};//첫번째 좌표
		int[] coord_2 = {sc.nextInt(),sc.nextInt()};//두본째 좌표
		int[] coord_3 = {sc.nextInt(),sc.nextInt()};//세번째 좌표
		sc.close();
		
		int x,y;
		
		//x 좌표 비교후 쌍을 이루지 않는 x좌표를 저장
		//1번 x좌표와 2번 x좌표 비교
		if(coord_1[0] == coord_2[0]) {
			x = coord_3[0];
		}
		//1번 x좌표와 3번 x좌표 비교
		else if(coord_1[0] == coord_3[0]){
			x = coord_2[0];
		}
		//2번 x좌표와 3번의 x좌표 비교
		else {
			x = coord_1[0];
		}
		//y 좌표 비교
		//1번 y좌표와 2번 y좌표 비교
		if(coord_1[1] == coord_2[1]) {
			y = coord_3[1];
		}
		//1번 y좌표와 3번 y좌표 비교
		else if(coord_1[1] == coord_3[1]) {
			y= coord_2[1];
		}
		//2번 y좌표와 3번 y좌표 비교
		else {
			y = coord_1[1];
		}
		System.out.println(x + " " + y);
		
	}

}
