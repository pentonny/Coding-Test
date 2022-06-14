import java.util.Scanner;

public class Main4344 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[];
      int a = sc.nextInt();
      
      for(int i=0;i<a;i++){
        int b = sc.nextInt();
        arr = new int[b];
        double sum=0;
        
        for(int j=0;j<b;j++){
          int val = sc.nextInt();
          arr[j]=val;
          sum += val;
        }
        double mean = (sum/b);
        double count = 0;
        
        for(int j=0;j<b;j++){
          if(arr[j]>mean){
            count++;
          }
        }
        System.out.printf("%.3f%%\n",(count/b)*100);
      }
      sc.close();
    }
}
