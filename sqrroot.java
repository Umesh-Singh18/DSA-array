class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // 0 or 1 → square root is the number itself

        int left = 1, right = x / 2; // search range
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow

            if ((long) mid * mid <= x) {
                ans = mid; // mid is a possible answer
                left = mid + 1; // try to find a bigger one
            } else {
                right = mid - 1; // mid^2 too big → go smaller
            }
        }

        return ans;
    }
}
