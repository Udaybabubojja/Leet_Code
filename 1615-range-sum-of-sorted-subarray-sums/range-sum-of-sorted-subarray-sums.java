class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> subarraySums = new ArrayList<>();
        int mod = 1000000007;

        // Generate all subarray sums
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarraySums.add(sum);
            }
        }

        // Sort the subarray sums
        Collections.sort(subarraySums);

        // Calculate the sum of elements from index left to right
        long rangeSum = 0;
        for (int i = left - 1; i < right; i++) {
            rangeSum = (rangeSum + subarraySums.get(i)) % mod;
        }

        return (int) rangeSum;
    }
}