import java.util.Scanner;

public class prg1simpleSieve {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        boolean bool []= new boolean[num];
        for(int i=0;i<bool.length;i++){
            bool[i]=true;
        }

        for(int i=2;i<Math.sqrt(num);i++){
            if(bool[i]==true){
                for(int j=i*i; j<num; j+=i){
                    bool[j]=false;
                }
            }
        }
        System.out.println("all prime no. upto "+num+" are");
        for(int i=2;i<bool.length;i++){
            if(bool[i]==true){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
