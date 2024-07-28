/* Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0] */

class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ nums[i];
        }

        int rightmost = (xor & (xor-1)) ^ xor;

        int b1 = 0;
        int b2 = 0;

        for(int i=0; i<n; i++){
            if((nums[i] & rightmost) !=0){
                b1 = b1 ^ nums[i];
            }
            else{
                b2 =b2 ^ nums[i];
            }
        }

        return new int[]{b1,b2};
    }
}