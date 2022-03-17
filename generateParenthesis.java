class Solution {
        List<String> list = new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            dfs(n,n,"");
            return list;
        }
        public void dfs(Integer left,Integer right,String write){
            if(left ==0 && right ==0){
                list.add(write);
                return;
            }

            if(left>0){
                dfs(left-1,right,write+"(");
            }
            if(left<right){
                dfs(left,right-1,write+")");
            }

        }


    }
