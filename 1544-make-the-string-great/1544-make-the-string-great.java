class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!stack.empty() && Math.abs(ch - stack.peek()) == 32) stack.pop();
            else stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) sb.append(stack.pop());

        return sb.reverse().toString();
    }
}