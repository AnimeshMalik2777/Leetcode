class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int lsum = 0, rsum = 0;

            // left sum
            for (int j = 0; j < i; j++) {
                lsum += nums[j];
            }

            // right sum
            for (int k = i + 1; k < n; k++) {
                rsum += nums[k];
            }

            if (lsum == rsum) {
                return i;
            }
        }
        return -1;
    }
}