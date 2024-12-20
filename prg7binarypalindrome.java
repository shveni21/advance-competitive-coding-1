import java.util.Scanner;

public class prg7binarypalindrome {
    public static boolean isbinaryPlaindrome(int num){
        int revNum=0;
        int copyNum=num;
        while(copyNum!=0){
            revNum=(revNum<<1)|(copyNum & 1);
            copyNum=copyNum>>1;
        }
        return revNum==num;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isbinaryPlaindrome(num));
        sc.close();
    }
}
