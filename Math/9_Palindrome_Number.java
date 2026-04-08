// 9. Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.

 class Solution {
    public boolean isPalindrome(int x) {
     if(x<0)
        return false;
        int original = x;
        int reverse = 0;
      

       while ( x != 0 ){
        int digit = x % 10;
        reverse = reverse * 10 + digit % 10;
        x = x/10; 
       }
        return original==reverse;
      
    }
      public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(121));
      }
}

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.