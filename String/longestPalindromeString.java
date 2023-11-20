import java.util.Scanner;

public class longestPalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        while (t-- > 0) {
            System.out.print("Enter the string for test case: ");
            String str = scanner.next();

            String result = longestPalin(str);
            System.out.println("Longest Palindrome: " + result);
        }

        scanner.close();
    }

    static String longestPalin(String S) {
        // Rest of the code for the longestPalin method remains the same
        int len = S.length();
        if (len == 0 || len == 1) return S;
        String ans = Character.toString(S.charAt(0));
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                if ((j - i) + 1 <= ans.length()) break;
                if (S.charAt(i) == S.charAt(j)) {
                    if (isPalindrome(S, i, j)) {
                        if ((j - i) + 1 > ans.length()) {
                            ans = S.substring(i, j + 1);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String str, int s, int e) {
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}
