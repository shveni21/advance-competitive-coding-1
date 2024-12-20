import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prg3incrementalSieve {
    public static List<Integer> incrementalSieve(int limit){
        List<Integer> oddNum= new ArrayList<>();
        for(int i=3;i<limit;i+=2){
            oddNum.add(i);
        }

        List<Integer> primes= new ArrayList<>();
        primes.add(2);

        for(int i=0;i<oddNum.size();i++){
            int current=oddNum.get(i);
            if(current!=-1){
                primes.add(current);
                for(int j=i;j<oddNum.size();j++){
                    if(oddNum.get(j)%current==0){
                        oddNum.set(j, -1);
                    }
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> primes= incrementalSieve(n);
        System.out.println(primes);
        sc.close();
    }
}
