class Solution {
    public int leastAvg(int[] arr, int k) {
        int n = arr.length;
        int currentSum = 0;

        // Calculate sum of first window of size k
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int minSum = currentSum;
        int minIndex = 0;

        // Slide the window over the rest of the array
        for (int i = k; i < n; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i - k + 1;
            }
        }

        // Return 1-based index of the first element of the subarray
        return minIndex + 1;
    }
}