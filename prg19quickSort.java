import java.util.Scanner;

public class prg19quickSort {
    static int partition(int arr[], int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }

    static int[] quickSort(int arr[], int low, int high){
        if(low<high){
            int pivot=partition(arr, low, high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        arr = quickSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
