package LEETCODE;
//leetcode 1. Two Sum
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //Solution 1: Using HashMap
            // Map<Integer,Integer> num= new HashMap<>();
            // for(int i=0;i<nums.length;i++){
            // if(num.containsKey(target-nums[i])){
            // return new int[]{num.get(target-nums[i]),i};
            // }
            // num.put(nums[i],i);
            // }

            //Solution 2: Brute Force
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            return null;

        }
    }

}
