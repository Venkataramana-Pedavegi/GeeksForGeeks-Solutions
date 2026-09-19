class Solution {
    int countPairs(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        long count = 0;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            }
            else if (sum > target) {
                right--;
            }
            else {

                // Both values are same
                if (arr[left] == arr[right]) {

                    int n = right - left + 1;

                    count += (long) n * (n - 1) / 2;

                    break;
                }

                // Count duplicates on left
                int leftValue = arr[left];
                long leftCount = 0;

                while (left <= right && arr[left] == leftValue) {
                    leftCount++;
                    left++;
                }

                // Count duplicates on right
                int rightValue = arr[right];
                long rightCount = 0;

                while (left <= right && arr[right] == rightValue) {
                    rightCount++;
                    right--;
                }

                count += leftCount * rightCount;
            }
        }

        return (int) count;
    }
}