class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);

        for (char c : ransomNote.toCharArray()) {
            int idx = sb.indexOf(String.valueOf(c));

            if (idx == -1) {
                return false;
            }

            sb.deleteCharAt(idx);
        }

        return true;
    }
}