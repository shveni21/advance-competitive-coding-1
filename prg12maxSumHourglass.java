import java.util.Scanner;

public class prg12maxSumHourglass {
    static int findMaxSumHourglass(int m[][], int row, int col){
        if(row<3 || col<3){
            System.out.println("no max sum hourglass");
            return Integer.MIN_VALUE;
        }
        
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<row-2;i++){
            for(int j=0; j<col-2;j++){
                int sum= (m[i][j]+m[i][j+1]+m[i][j+2])
                + (m[i+1][j+1])+
                (m[i+2][j]+m[i+2][j+1]+m[i+2][j+2]);

                maxSum=Math.max(maxSum,sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int m[][]= new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m[i][j]=sc.nextInt();
            }
        }
        int res=findMaxSumHourglass(m, row, col);
        if(res!=Integer.MIN_VALUE){
            System.out.println(res);
        }
        sc.close();
    }
}
