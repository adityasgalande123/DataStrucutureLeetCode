import java.util.*;

class Solution {

    public void getPerms(int[] nums, int idx, List<List<Integer>> ans) {

        // Base case
        if (idx == nums.length) {

            List<Integer> current = new ArrayList<>();

            for (int num : nums) {
                current.add(num);
            }

            ans.add(current);
            return;
        }

        // Try every element as the current choice
        for (int i = idx; i < nums.length; i++) {

            // Swap current element with choice
            swap(nums, idx, i);

            // Recursion
            getPerms(nums, idx + 1, ans);

            // Backtracking
            swap(nums, idx, i);
        }
    }

    public void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        getPerms(nums, 0, ans);

        return ans;
    }
}