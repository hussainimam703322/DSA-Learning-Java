package DPStrings;

public class lpalindromesubstring {
    public static void main(String[] args) {
        String s = "babad";

        System.out.println("Input: " + s);
        System.out.println("Output: " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean isPalindrome[][] = new boolean[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }
        int start = 0, end = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1 || isPalindrome[i + 1][j - 1]) {
                        isPalindrome[i][j] = true;
                        if (j - i + 1 > end - start) {
                            start = i;
                            end = j;
                        }
                    }
                }

            }
        }
        return s.substring(start, end + 1);

    }
}
/*
Nested loops:

for(int i=n-1;i>=0;i--): Iterate over the characters of the string in reverse order.
for(int j=i+1;j<n;j++): Iterate over the characters following i.
Inside the nested loops:

Check if the characters at indices i and j are equal: if(s.charAt(i) == s.charAt(j)).
If the characters are equal, check if the substring between i and j is a palindrome:
If the substring has a length of 1 (j-i == 1) or if the substring without the outer characters (isPalindrome[i+1][j-1]) is a palindrome, set isPalindrome[i][j] to true.
If the current palindrome substring is longer than the previous longest palindrome found, update start and end to the indices of the current palindrome substring.
After the nested loops, return the longest palindromic substring of s using s.substring(start, end+1)
 */