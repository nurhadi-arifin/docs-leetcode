import java.util.HashMap;
import java.util.Arrays;

class SolutionTwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int selisih = target - nums[i];

            if (map.containsKey(selisih)) {
                return new int[] { map.get(selisih), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}

public class TwoSums {
    public static void main(String[] args) {
        SolutionTwoSums solutionTwoSums = new SolutionTwoSums();

        // Tes 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] hasil1 = solutionTwoSums.twoSum(nums1, target1);
        System.out.println("Test 1: " + Arrays.toString(nums1));
        System.out.println("hasil: " + Arrays.toString(hasil1));

        // Tes 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] hasil2 = solutionTwoSums.twoSum(nums2, target2);
        System.out.println("Test 2: " + Arrays.toString(nums2));
        System.out.println("hasil: " + Arrays.toString(hasil2));
    }
}