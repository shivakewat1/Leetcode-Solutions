// Square Root

// Given a non-negative integer x,
//  return the square root of x rounded down to the nearest integer.
//  The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        return x;
        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right){
            int mid = left + (right - left)/2;

            if ((long) mid * mid == x){
                return mid;
            }else if((long) mid * mid < x){
                ans = mid ;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.