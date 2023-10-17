import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
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