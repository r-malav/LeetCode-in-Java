package g0501_0600.s0565_array_nesting;

// #Medium #Array #Depth_First_Search

public class Solution {
    public int arrayNesting(int[] nums) {
        int index = -1;
        int value = 0;
        int maxLen = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                index = i;
                len = 0;
                while (nums[index] != -1) {
                    value = nums[index];
                    nums[index] = -1;
                    index = value;
                    len++;
                }
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}