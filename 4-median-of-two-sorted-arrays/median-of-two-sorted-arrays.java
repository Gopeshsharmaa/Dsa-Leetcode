class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = n + m;
        int i = 0, j = 0, idx = 0;
        int prev = 0, curr = 0;

        while (idx <= k / 2) {
            prev = curr;

            if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
            idx++;
        }
        if (k % 2 == 0) {
            return (prev + curr) / 2.0;
        } else {
            return curr;
        }
    }
}
