import java.util.Scanner;

public class prg6chineseReminder {
    static int CRT(int a[], int m[], int n, int p){
        int x=0;

        for(int i=0;i<n;i++){
            int M=p/m[i];
            int y=0;
            for(int j=0;j<m[i];j++){
                if((M*j)%m[i]==1){
                    y=j;
                    break;
                }
            }
            x=x+a[i]*M*y;
        }
        return x%p;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of congruences");
        int n=sc.nextInt();
        System.out.println("enter reminders");
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter moduli");
        int m[]= new int[n];
        int p=1;
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
            p=p*m[i];
        }
        System.out.println("solution is" +CRT(a, m, n, p));
        sc.close();
    }
}
