import java.util.Scanner;
public class AveryBigsum{

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar,int arCount)
    {
        int i = 0;
        long sum = 0;
        while (i < arCount) {
            sum += ar[i];
            i++;
        }
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {


        int arCount = scanner.nextInt();
        long[] ar = new long[arCount];



        for (int i = 0; i < arCount; i++) {
            ar[i]=scanner.nextLong();
        }

        long result = aVeryBigSum(ar,arCount);

        System.out.println(result);
        scanner.close();
    }
}
