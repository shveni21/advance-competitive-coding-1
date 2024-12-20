import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prg5strobogrammaticNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String num=sc.nextLine();
        if(strobogramaticNum(num)){
            System.out.println("is a strobo");
        }else{
            System.out.println("is not a strobo");
        }
        sc.close();;
    }

    public static boolean strobogramaticNum(String num){
        Map<Character,Character> strobo= new HashMap<>();
        strobo.put('0', '0');
        strobo.put('1', '1');
        strobo.put('8', '8');
        strobo.put('6', '9');
        strobo.put('9', '6');

        int n=num.length();
        for (int i = 0, j = (n - 1); i <= j; i++, j--){
            char digit_left=num.charAt(i);
            char digit_right=num.charAt(j);
            char mapping = strobo.getOrDefault(digit_left, '-');

            if(mapping == '-'){
                return false;
            }
            if(mapping!=digit_right){
                return false;
            }
        }
        return true;

    }
}
