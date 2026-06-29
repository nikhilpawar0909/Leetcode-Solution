class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek() * 2) ;
            }
            else if(operations[i].equals("+")){
                stack.push(stack.peek() + stack.get(stack.size() - 2));
            }
            else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }

        int ans = 0;
        for(int num : stack){
            ans += num;
        }
        return ans;
    }
}