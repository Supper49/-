class Solution {
        List<String> ans = new ArrayList<>(); //存储答案
        StringBuffer sb = new StringBuffer(); //存储每一次的数据
        String[] record = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        public List<String> letterCombinations(String digits) {
            if (digits.equals("")){
                return ans;
            }
            dfs(digits, 0);
            return ans;
        }

        public void dfs(String s, int index){
            if (sb.length() == s.length()) {
                ans.add(sb.toString());
                return;
            }
            char cha =s.charAt(index);
            String st =record[cha-'0'];

            for(int i =0;i<st.length();i++) {
                sb.append(st.charAt(i));
                dfs(s,index+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
