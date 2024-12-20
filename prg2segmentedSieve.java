import java.util.*;

class prg2segmentedSieve {
    static int N = 100000;
    static boolean arr[] = new boolean[N+1];

    static void simpleSieve() {
        for (int i = 2; i <= N; i++) {
            arr[i] = true;
        }
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (arr[i] == true) {
                for (int j = i * i; j <= N; j = j + i) {
                    arr[j] = false;
                }
            }
        }
    }
    
    static ArrayList<Integer> generatePrimes(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (arr[i] == true) {
                al.add(i);
            }
        }
        return al;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();  //80
        int high = sc.nextInt(); //90
        simpleSieve();
        ArrayList<Integer> al = generatePrimes(high);
        boolean dummy[] = new boolean[high - low + 1];
        
        for (int i = 0; i < high - low + 1; i++) {
            dummy[i] = true;
        }
        
        for (int prime : al) {
            int firstMultiple = (low / prime) * prime;
            if (firstMultiple < low) {
                firstMultiple = firstMultiple + prime;
            }
            int start = Math.max(firstMultiple, prime * prime);
            for (int j = start; j <= high; j += prime) {
                dummy[j - low] = false;
            }
        }
        for (int i = low; i <= high; i++) {
            if (dummy[i - low] == true) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
