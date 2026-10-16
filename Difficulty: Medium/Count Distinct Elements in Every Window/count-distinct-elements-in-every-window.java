class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // First window of size k
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());

        // Slide the window over the rest of the array
        for (int i = k; i < arr.length; i++) {
            // Remove the element going out of the window
            int outgoing = arr[i - k];
            if (map.get(outgoing) == 1) {
                map.remove(outgoing);
            } else {
                map.put(outgoing, map.get(outgoing) - 1);
            }

            // Add the new element coming into the window
            int incoming = arr[i];
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            result.add(map.size());
        }

        return result;
    }
}