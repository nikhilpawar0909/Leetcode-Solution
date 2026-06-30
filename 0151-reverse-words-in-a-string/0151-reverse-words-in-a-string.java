class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String words[] = s.split("\\s+");
        int l = 0;
        int r = words.length - 1;
        while(l < r){
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }
        // return String.join(" ", words).trim();
        for(String word : words){
            sb.append(word+" ");
        }
        return sb.toString().trim();
    }
}