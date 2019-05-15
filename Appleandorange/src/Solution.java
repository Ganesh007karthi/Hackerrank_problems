import java.util.Scanner;
public class Solution {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int t=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int m=in.nextInt();
        int n=in.nextInt();

        int apple=0;
        int orange=0;
        for(int i=0;i<m;i++){
           int g=in.nextInt()+a;
           if(g>=s&&g<=t){
               apple++;
            }
        }
        for(int i=0;i<n;i++){
            int g=in.nextInt()+b;
            if(g>=s&&g<=t){
                orange++;
            }
        }

        System.out.println(apple);
        System.out.println(orange);

    }
}
