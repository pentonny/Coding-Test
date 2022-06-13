import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i <a; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[a -1]);
	}	
}
/*가장 기초적인 방법이다.

맨 첫줄에 N을 입력받아 해당 크기의 배열을 선언한 뒤 arr 배열 원소에 각각 입력받은 값을 넣어주는 방법이다.

그리고 최댓값과 최솟값을 찾는 방법은 매우 쉽다.

우리에겐 Arrays.sort() 라는 메소드가 있다.

이 메소드는 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드다.

이 메소드를 활용하여 정렬하면 최솟값은 배열의 첫번째 원소(index 0)에, 
최댓값은 배열의 마지막 원소(arr.length-1)에 있을테니 이를 출력하면 된다.*/
