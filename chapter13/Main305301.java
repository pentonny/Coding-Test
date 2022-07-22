package Main13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main305301 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double R = Double.parseDouble(br.readLine()); // 반지름 R

		System.out.println(R * R * Math.PI); //유클리드 원의 넓이
		System.out.println(2 * R * R); //택시기하학 원의 넓이
	}

}
