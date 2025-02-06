import java.util.HashMap;
import java.util.Map;

public class Leetcode05 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }

        throw new RuntimeException("No solution found");
    }

    public static void main(String[] args) {
        Leetcode05 solution = new Leetcode05();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices of the numbers that add up to target:");
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
