import java.util.Scanner;

public class prg28manchersalgo {
    public static String longestPlaindromeSubString(String s){
        StringBuilder t=new StringBuilder();
        t.append("#");
        for(int i=0;i<s.length();i++){
            t.append(s.charAt(i)).append("#");
        }
        char[] chars=t.toString().toCharArray();
        int n=chars.length;
        int p[]=new int[n];
        int center=0,right=0;
        int maxLen=0;
        int centerIndex=0;

        for(int i=0;i<n;i++){
            int mirror=2*center - i;

            if(i<right){
                p[i]=Math.min(right-i, p[mirror]);
            }

            while(i+p[i]+1<n && i-p[i]-1>=0 && chars[i+p[i]+1]==chars[i-p[i]-1]){
                p[i]++;
            }

            if(i+p[i]>right){
                center=i;
                right=i+p[i];
            }

            if(p[i]>maxLen){
                maxLen=p[i];
                centerIndex=i;
            }
        }

        int start=(centerIndex-maxLen)/2;
        return s.substring(start, start+maxLen);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(longestPlaindromeSubString(s));
        sc.close();
    }
}