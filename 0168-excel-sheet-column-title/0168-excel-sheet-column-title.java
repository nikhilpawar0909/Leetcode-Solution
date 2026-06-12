class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            char ch = (char)('A' + columnNumber % 26);
            str.append(ch);
            columnNumber /= 26;
        }

        return str.reverse().toString();
    }
}
