import java.util.*;

class Solution {
    public boolean isProduct(int[] arr, long target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            long product = (long) arr[left] * arr[right];

            if (product == target) {
                return true;
            }

            // Handle target = 0
            if (target == 0) {
                if (arr[left] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            // Positive target
            else if (target > 0) {
                if (product < target) {
                    left++;
                } else {
                    right--;
                }
            }
            // Negative target
            else {
                if (product < target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return false;
    }
}