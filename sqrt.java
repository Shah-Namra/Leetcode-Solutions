class Solution {
    public int mySqrt(int x) {
       int l = 0;
    int r = x;

    if (x == 0 || x == 1)
        return x;

    while (l <= r) {
        int m = l + (r - l) / 2;
        long square = (long) m * m; // Use long to prevent overflow

        if (square == x) {
            return (int) m; // Found the exact square root
        } else if (square < x) {
            l = m + 1;
        } else {
            r = m - 1;
        }
    }

    return r;
 
    }
}