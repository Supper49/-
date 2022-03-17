class Solution {
    public int longestValidParentheses(String s) {
            int max =0;
            Deque<Integer> kuo = new LinkedList<Integer>();
            kuo.push(-1);
            for(int i =0;i<s.length();i++){
                if (s.charAt(i)=='('){
                    kuo.push(i);
                }else{
                    kuo.pop();
                    if (kuo.isEmpty()){
                        kuo.push(i);
                    }else {
                        max = Math.max(max,i-kuo.peek());
                    }
                }
            }
            return max;
        }
}
