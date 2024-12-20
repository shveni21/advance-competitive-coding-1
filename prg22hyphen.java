import java.util.Scanner;

public class prg22hyphen {
    static String moveHyphen(String str){
        String ans1=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                ans1='-'+ans1;
            }else{
                ans1+=str.charAt(i);
            }
        }
        return ans1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(moveHyphen(str));
        sc.close();
    }
}
