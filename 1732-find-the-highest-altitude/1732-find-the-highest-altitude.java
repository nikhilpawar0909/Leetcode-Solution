class Solution {
    public int largestAltitude(int[] gain) {
        int ans[] = new int[gain.length + 1];

        for(int i = 0; i < ans.length; i++){
            int sum = 0; 
            for(int j = 0; j < i; j++){
                sum += gain[j];
            }
            ans[i] = sum;
        }
        int max = ans[0];
        for(int i = 1; i < ans.length; i++){
            max = Math.max(max, ans[i]);
        }

        return max;
    }
}