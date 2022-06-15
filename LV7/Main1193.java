import java.util.Scanner;
public class Main1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cross_count =1, prev_count_sum=0;
		
		while(true) {
			if(a <= prev_count_sum + cross_count) {
				if(cross_count%2==1) {
					System.out.print((cross_count-(a-prev_count_sum-1))+"/"+(a-prev_count_sum));
					break;
				}
				else {
					System.out.print((a-prev_count_sum)+"/"+ (cross_count-(a-prev_count_sum-1)));
					break;
				}
				
			}else {
					prev_count_sum+=cross_count;
					cross_count++;
				}
		}
	}

}
