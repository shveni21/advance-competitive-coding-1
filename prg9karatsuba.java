import java.util.Scanner;

public class prg9karatsuba {
    public static int karatsuba(int x,int y){
        if(x<10 || y<10){
            return x*y;
        }

        int m=Math.max(getDigits(x),getDigits(y));
        int halfOfM=m/2;
        int powerof10= (int)Math.pow(10,halfOfM);

        int a=x/powerof10;
        int b=x%powerof10;
        int c=y/powerof10;
        int d=y%powerof10;

        int ac=karatsuba(a, c);
        int bd=karatsuba(b, d);
        int abcd=karatsuba(a+b, c+d);

        int result= ac*(int)Math.pow(10, 2*halfOfM) + 
        (abcd-ac-bd)*powerof10 + bd;

        return result;
    }

    private static int getDigits(int x){
        if(x==0){
            return 1;
        }
        int count=0;
        while(x>0){
            count++;
            x/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        int product=karatsuba(x, y);
        System.out.println(product);
        sc.close();
    }
}
