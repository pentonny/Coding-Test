package Main13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main247701 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[6];
		int MaxWidthI = 0, MaxWidth = 0, MaxHeight = 0, MaxHeightI = 0, d;

		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			d = Integer.parseInt(st.nextToken());
			arr[i] = Integer.parseInt(st.nextToken());
			// 가장 긴 가로의 길이와 위치 찾기
			if ((d == 1 || d == 2) && MaxWidth < arr[i]) {
				MaxWidth = arr[i];
				MaxWidthI = i;
			}
			// 가장 긴 세로의 길이와 위치 찾기
			else if ((d == 3 || d == 4) && MaxHeight < arr[i]) {
				MaxHeight = arr[i];
				MaxHeightI = i;
			}
		}
		int right, left, minWidth, minHeight;

		if (MaxWidthI + 1 == 6)
			right = 0;
		else
			right = MaxWidthI + 1;

		if (MaxWidthI - 1 == -1)
			left = 5;
		else
			left = MaxWidthI - 1;
		// 빈 사각형의 세로길이
		minHeight = Math.abs(arr[right] - arr[left]);

		if (MaxHeightI + 1 == 6)
			right = 0;
		else
			right = MaxHeightI + 1;

		if (MaxHeightI - 1 == -1)
			left = 5;
		else
			left = MaxHeightI - 1;
		// 빈 사각형의 가로 길이
		minWidth = Math.abs(arr[right] - arr[left]);

		System.out.println(((MaxWidth * MaxHeight) - (minHeight * minWidth)) * N);

	}

}
