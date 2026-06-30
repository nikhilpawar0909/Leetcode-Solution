class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            String s = strs[i];
            int temp = 0;
            for(int j = 0; j < Math.min(prefix.length(), s.length()); j++){
                if(prefix.charAt(j) != s.charAt(j)){
                    temp = 1;
                    prefix = s.substring(0, j);
                    break;
                }
            }
            if(temp == 0){
                prefix = prefix.length() > s.length()? s:prefix;
            }
        }
        return prefix;
    }
}