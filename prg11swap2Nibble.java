import java.util.Scanner;

public class prg11swap2Nibble {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int swapNum;
        swapNum=((num & 0x0F)<<4) | ((num & 0xF0)>>4);
        System.out.println(swapNum);
        sc.close();
    }
}
