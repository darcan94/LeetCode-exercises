/**
 *  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.


    Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

    Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]
 */
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));    
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(hash.containsKey(nums[i])){
                return new int[]{hash.get(nums[i]), i};
            }
            hash.put(target - nums[i], i);
        }
        return new int[]{};
    }
}