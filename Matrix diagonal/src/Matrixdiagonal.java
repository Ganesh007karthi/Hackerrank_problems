import java.util.Scanner;
public class Matrixdiagonal {
public static void main(String args[]){
    System.out.println("Enter the order of the matrix");
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    int n=in.nextInt();
    System.out.println("Enter the matrix now:");
    int ar[][]=new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            ar[i][j]=in.nextInt();
        }
    }
  if(m<n||m==n) {
      for (int i = 0; i < m; i++) {
          int k=0;
          k=i;
          int j = 0;
          while (k >= 0 && j < n) {
              System.out.print(ar[k][j]+" ");
              k--;
              j++;

          } System.out.println("");
      }
      for (int j = 1; j < n; j++) {
          int i = m - 1;
          int t=j;
          while (t< n && i >= 0) {
              System.out.print(ar[i][t]+" ");
              i--;
              t++;
          } System.out.println(" ");
      }
  }
  else{
      for (int i = 0; i < m; i++) {
          int j = 0;
          int k=i;
          while (k >= 0 && j < n) {
              System.out.print(ar[k][j]+" ");
              k--;
              j++;
          } System.out.println(" ");
      }
  }
}
}
