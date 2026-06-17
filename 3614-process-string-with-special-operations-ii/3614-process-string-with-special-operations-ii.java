class Solution {
    public char processStr(String s, long k) {
        int n = s.length();

        long[] len = new long[n + 1];
        long LIMIT = (long) 1e18;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                len[i + 1] = Math.min(LIMIT, len[i] + 1);
            } else if (c == '*') {
                len[i + 1] = len[i] > 0 ? len[i] - 1 : 0;
            } else if (c == '#') {
                len[i + 1] = Math.min(LIMIT, len[i] * 2);
            } else { // %
                len[i + 1] = len[i];
            }
        }

        if (k >= len[n]) {
            return '.';
        }

        long idx = k;

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);

            long before = len[i];
            long after = len[i + 1];

            if (c >= 'a' && c <= 'z') {

                if (idx == after - 1) {
                    return c;
                }

            } else if (c == '#') {

                if (before > 0) {
                    idx %= before;
                }

            } else if (c == '%') {

                if (after > 0) {
                    idx = after - 1 - idx;
                }

            } else { // '*'

                // reverse of deletion:
                // before -> before-1
                // if before > 0 then deleted char was at index after
                // our idx is always < after, so no change needed

            }
        }

        return '.';
    }
}