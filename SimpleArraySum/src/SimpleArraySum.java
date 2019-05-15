import java.util.*;


public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar,int arCount) {
        /*
         * Write your code here.
         */
        int i=0;
        int sum=0;
        while(i<arCount){
            sum+=ar[i];
            i++;

        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int arCount;
        Scanner in=new Scanner(System.in);
        arCount=in.nextInt();
        int ar[]=new int[arCount];
        for(int i=0;i<arCount;i++){
            ar[i]=in.nextInt();
        }

        int result = simpleArraySum(ar,arCount);

        System.out.println(result);

    }
}
