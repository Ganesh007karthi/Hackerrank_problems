import java.util.Scanner;

public class Solution {
    static int[] breakingRecords(int[] scores) {
    int result[]=new int[2];
    int max=0;
    int min=0;
    int largest=scores[0];
    int lowest=scores[0];
    for(int i=0;i<scores.length;i++){
        if(scores[i]>largest){
            max++;
            largest=scores[i];
        }
       if (scores[i]<lowest){
            min++;
            lowest=scores[i];
        }
    }
    result[0]=max;
    result[1]=min;


    return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
      System.out.println("Enter the number of match");
      int n=scanner.nextInt();
      System.out.println("Enter the points of Maria....");
      int scores[]=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=scanner.nextInt();
        }
        int result[]=breakingRecords(scores);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

}
