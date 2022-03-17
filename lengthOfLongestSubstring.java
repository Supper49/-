class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int start = 0;
        int[] last = new int[128];
        int len = s.length();
        for (int i=0;i<128;i++){
            last[i]=-1;
        }

        for (int i=0;i<len;i++){
            int index = s.charAt(i);
            start = Math.max(start,last[index]+1);
            res = Math.max(res,i-start+1);
            last[index] = i;
        }



        return res;
    }

}
