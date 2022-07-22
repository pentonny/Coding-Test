package Main13;

import java.util.Scanner;

public class Main3053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double R = sc.nextDouble(); //반지름 R
		sc.close();

		System.out.println(R * R * Math.PI); //유클리드 원의 넓이
		System.out.println(2 * R * R); //택시기하학 원의 넓이
	}

}
