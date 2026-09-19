import java.util.*;

class Solution {
    public List<Integer> twoSum(int arr[], int target) {

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int needed = target - num;

            if (set.contains(needed)) {
                ans.add(needed);
                ans.add(num);
                return ans;
            }

            set.add(num);
        }

        return ans;
    }
}