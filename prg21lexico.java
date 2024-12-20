import java.util.*;

class prg21lexico {

    static String makePalindrome(TreeMap<Character, Integer> hm) {
        int count = 0;
        String prefix = "", oddStr = "";

        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            int itr = e.getValue() / 2;

            // Add half the occurrences to prefix
            for (int i = 0; i < itr; i++) {
                prefix = prefix + e.getKey();
            }

            // Check for odd occurrences
            if (e.getValue() % 2 == 1) {
                oddStr += e.getKey();
                count++;
            }

            // If more than one odd character exists, palindrome isn't possible
            if (count > 1) {
                return "Can't make a palindrome";
            }
        }

        // Create the suffix as the reverse of the prefix
        String suffix = new StringBuilder(prefix).reverse().toString();

        // Return the final palindrome
        return prefix + oddStr + suffix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();

        // Create a TreeMap to store character frequencies
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (char ele : ch) {
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }

        // Generate and print the palindrome
        System.out.println(makePalindrome(hm));
        sc.close();
    }
}
