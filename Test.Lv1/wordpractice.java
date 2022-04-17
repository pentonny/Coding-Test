package codingTest;
import java.util.Scanner;

public class wordpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		str = str.toUpperCase(); //대문자로 모두 전환(toLowerCase 소문자)
		int alphabet[] = new int[26]; //A~Z까지 0~25에 각가 나온 횟수를 저장할 배열 초기화
		for(int i = 0; i<str.length();i++) {
			alphabet[str.charAt(i)-'A']++; //나온 단어에 해당하는 인덱스의 정수값을 1씩 증가한다.
		}
		int max = 0, ans =0;
		for(int  i = 0; i<alphabet.length; i++) {
			if(max < alphabet[i]) { //지금까지 나온 최빈값이랑 현재 인덱스의 저장된 값이랑 비교
				max = alphabet[i];
				ans = i;
			}
			else if(max == alphabet[i]){
				ans = -2; //아스키코드 65-2 = 63 ?가 나옴
			}
		}
		System.out.printf("%s",Character.toString(ans+'A'));
	}

}
