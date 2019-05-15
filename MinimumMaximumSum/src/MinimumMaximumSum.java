import java.util.Scanner;
public class MinimumMaximumSum {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int i=0;i<5;i++){
            arr[i]=in.nextLong();
        }
        long max=0;long min=0;
        for(int a=0;a<5;a++){
            long sum1[]=new long[5];
            sum1[a]=sumofarray(a,arr);
            if(a==0){
                max=sum1[a];
                min=sum1[a];
            }
            if(sum1[a]>max){
                max=sum1[a];}
                else if(sum1[a]<min){
                    min=sum1[a];
                            }
        }
        System.out.println(min+" "+max);
    }
    static long sumofarray(int a,long arr[]){
        long sum=0;
        for(int i=0;i<5;i++){
            if(i!=a){
             sum+=arr[i];
            }
        }return sum;
    }
}
