class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : arr1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Initialize the result array
        int[] result = new int[arr1.length];
        int k = 0;
        
        // Step 3: Add elements in arr2 order using the frequency dictionary
        for (int num : arr2) {
            if (count.containsKey(num)) {
                int occurrences = count.get(num);
                for (int i = 0; i < occurrences; i++) {
                    result[k++] = num;
                }
                count.remove(num); // Remove the element from count once it's used
            }
        }
        
        // Step 4: Add the remaining elements sorted
        List<Integer> remaining = new ArrayList<>(count.keySet());
        Collections.sort(remaining);
        for (int num : remaining) {
            int occurrences = count.get(num);
            for (int i = 0; i < occurrences; i++) {
                result[k++] = num;
            }
        }
        
        return result;
    }
}