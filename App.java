import java.util.Arrays;

public class App {
     public static void main(String[] args) {
        /**
         * 001-two-sum
         */
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
