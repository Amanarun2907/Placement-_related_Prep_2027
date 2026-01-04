
//You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.
public class palindrome_string_06 {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) { // Logic building
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "madam";
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str1));

    }
}
// palindrome problem
// racecar is the example of palindrome
// noon and madam
// time complexity is o(n).
//You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.