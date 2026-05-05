import java.util.*;

class Solution {
    public int minOperations(int[] arr, int k) {
        int n = arr.length;

        int r = arr[0] % k;
        for (int i = 1; i < n; i++) {
            if (arr[i] % k != r) return -1;
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i] / k;
        }

        Arrays.sort(b);

        int m = b[n / 2];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += Math.abs(b[i] - m);
        }

        return ans;
    }
}
