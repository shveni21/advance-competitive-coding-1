import java.util.Scanner;

public class prg14maxEquilibriumSum {
    static int findMaxSum(int arr[], int n){
        int sum=0;
        for(int num: arr){
            sum+=num;
        }

        int prefixSum=0;
        int res=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            if(prefixSum==sum){
                res=Math.max(res,prefixSum);
            }
            sum-=arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int [n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int result=findMaxSum(arr, n);
            if(result!=Integer.MIN_VALUE){
                System.out.println(result);
            }else{
                System.out.println("no equilibrium");
            }
            sc.close();
    }
}
