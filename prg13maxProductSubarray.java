import java.util.Scanner;

public class prg13maxProductSubarray {
    static int maxProductSubarray(int arr[]){
        int maxProduct=arr[0], minProduct=arr[0],globalMax=arr[0];

        for(int i=1; i<arr.length;i++){
            int temp=Math.max(arr[i],Math.max(maxProduct*arr[i],minProduct*arr[i]));
            minProduct=Math.min(arr[i],Math.min(maxProduct*arr[i],minProduct*arr[i]));
            maxProduct=temp;
            globalMax=Math.max(maxProduct, globalMax);
        }
        return globalMax;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=maxProductSubarray(arr);
        System.out.println(result);
        sc.close();
    }
}
