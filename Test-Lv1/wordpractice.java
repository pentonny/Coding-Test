package codingTest;
import java.util.Scanner;

public class wordpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		str = str.toUpperCase(); //�빮�ڷ� ��� ��ȯ(toLowerCase �ҹ���)
		int alphabet[] = new int[26]; //A~Z���� 0~25�� ���� ���� Ƚ���� ������ �迭 �ʱ�ȭ
		for(int i = 0; i<str.length();i++) {
			alphabet[str.charAt(i)-'A']++; //���� �ܾ �ش��ϴ� �ε����� �������� 1�� �����Ѵ�.
		}
		int max = 0, ans =0;
		for(int  i = 0; i<alphabet.length; i++) {
			if(max < alphabet[i]) { //���ݱ��� ���� �ֺ��̶� ���� �ε����� ����� ���̶� ��
				max = alphabet[i];
				ans = i;
			}
			else if(max == alphabet[i]){
				ans = -2; //�ƽ�Ű�ڵ� 65-2 = 63 ?�� ����
			}
		}
		System.out.printf("%s",Character.toString(ans+'A'));
	}

}
