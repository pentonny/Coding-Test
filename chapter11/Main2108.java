package Main001;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main2108 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		
	//입력값 범위: -4000 ~ 4000
		int[] arr =new int[8001];
		
		/*
		 * sum = 총 합계
		 * max = 최댓값
		 * min = 최솟값
		 * median = 중앙값
		 * mode = 최빈값
		 * */
		int sum =0;
		int max =Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		//median 과 mode는 -4000~4000 을 제외한 수로 초기화하면 된다.
		int median =10000;
		int mode =10000;
		
		for(int i=0;i<N;i++) {
			int value = Integer.parseInt(br.readLine());
			sum +=value;
			arr[value +4000]++;
			
			if(max<value) {
				max =value;
			}
			if(min>value) {
				min=value;
			}
		}
		//순회
		int count =0; //중앙값 빈도 누적 수
		int mode_max =0; //최빈값의 최닷값
		
		//이전의 동일한 최빈값 1번만 등장했을 경우 true,아닐경우 false
		boolean flag =false;
		
		for(int i=min+4000;i<=max+4000;i++) {
			if(arr[i]>0) {
				/*
				 * <중앙값 찾기>
				 * 누적횟수가 전체 길이의 절반에 못 미친다면
				 * */
				if(count<(N+1)/2) {
					count += arr[i];
					median =i-4000;
				}
				/*
				 * <최빈값 찾기>
				 * 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
				 * */
				if(mode_max<arr[i]) {
					mode_max =arr[i];
					mode =i-4000;
					flag =true;
				}
				//이전 최빈값과 동일한 경우면서 한 번만 중복되는 경우
				else if(mode_max ==arr[i]&&flag==true) {
					mode =i-4000;
					flag =false;
				}
			}
		}
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max-min);
		
	}

}
