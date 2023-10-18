/**
 * Given an integer x, return true if x is a 
    palindrome, and false otherwise.

    Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int number){
        if(number < 0 || (number != 0 && number % 10 == 0)) return false;
        int rev = 0;
        while(number > rev){
            rev = rev*10 + number%10;
            number = (int) Math.floor(rev/10);
        }
        return number==rev || number == Math.floor(rev/10);
    }
}
