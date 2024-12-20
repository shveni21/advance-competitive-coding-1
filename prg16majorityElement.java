import java.util.Scanner;

public class prg16majorityElement {
    static int majorityElement(int nums[]){
        int candidate=0, count=0;

        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            count+=(num==candidate)?1:-1;
        }

        count=0;
        for(int num:nums){
            if(num==candidate){
                count++;
            }
        }

        if(count>nums.length/2){
            return candidate;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=majorityElement(nums);
        if(result!=-1){
            System.out.println(result);
        }else{
            System.out.println("no majority element found");
        }
        sc.close();
    }
}
