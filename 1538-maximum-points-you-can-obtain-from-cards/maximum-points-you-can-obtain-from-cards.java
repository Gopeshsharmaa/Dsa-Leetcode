class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int totalSum = 0;
        for (int x : cardPoints) totalSum += x;

        int windowSize = n - k;
        if (windowSize == 0) return totalSum;

        int sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += cardPoints[i];
        }

        int minSum = sum;
        for (int i = windowSize; i < n; i++) {
            sum += cardPoints[i];
            sum -= cardPoints[i - windowSize];
            minSum = Math.min(minSum, sum);
        }

        return totalSum - minSum;
    }
}