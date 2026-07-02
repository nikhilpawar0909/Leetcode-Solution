class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        generate(n, "", 0, 0, list);
        return (list);
    }

    public static void generate(int n, String ans, int open, int close, List<String> list){
        if(open == n && close == n){
            list.add(ans);
            return;
        }
        if(open < n){
            generate(n, ans + "(", open + 1, close, list);
        }
        if(open > close){
            generate(n, ans + ")", open, close + 1, list);
        }
    }
}