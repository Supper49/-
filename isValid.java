class Solution {
public boolean isValid(String s) {
            Deque<Character> dq = new LinkedList<>();
            char cha ;
            for(int i =0; i<s.length();i++){
                cha =s.charAt(i);
                if (cha == '('){
                    dq.push(')');
                }else if(cha =='['){
                    dq.push(']');
                }else if(cha =='{'){
                    dq.push('}');
                }else if(dq.isEmpty() || cha!=dq.getFirst()){
                    return false;
                }else {
                    dq.pop();
                }
            }
            return dq.isEmpty();

        }
}
