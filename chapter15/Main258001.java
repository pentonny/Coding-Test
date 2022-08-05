package Main15;

import java.util.Scanner;

public class Main258001 {
	public static int[][] arr = new int[9][9];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sudoku(0, 0);

	}

	public static void sudoku(int row, int col) {
		// 해당 행이 다 채워졌을 경우 다음 행의 첫번째 열부터 시작
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
		// 행과 열이 모두 채워졌을 경우 출력 후 종료
		if (row == 9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.print(sb);
			System.exit(0);
		}
		// 만약 해당 위치의 값이 0이라면 1부터 9까지 중 가능한 수 탐색
		if (arr[row][col] == 0) {
			for (int i = 0; i <= 9; i++) {
				// i값이 중복되지 않는지 검사
				if (possibilty(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		sudoku(row, col + 1);
	}

	public static boolean possibilty(int row, int col, int value) {
		// 같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == value) {
				return false;
			}
		}
		// 같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == value) {
				return false;
			}
		}
		// 3*3 칸에 중복되는 원소가 있는지 검사
		int set_row = (row / 3) * 3;
		int set_col = (col / 3) * 3;

		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
}
