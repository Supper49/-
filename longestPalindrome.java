class Solution {
    public static boolean find(String s2) {
        String[] words = s2.split("");
        int len = words.length;
        for (int i=0;i<len/2;i=i+1){
            if(!words[i].equals(words[len-i-1])){
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        int total = 0;
        String[] words = s.split("");
        boolean flag = true;
        int max = 0;
        int len = s.length();
        int x =0;
        int y = 0;
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                flag = find(s.substring(i,j+1));
                if (flag == true && j-i+1>max){
                    max = j-i+1;
                    x=i;
                    y=j+1;
                    total= total+1;

                }
            }

        }
        if (total==0){
            return s.substring(0,1);
        }else {
            return s.substring(x,y);
        }
    }
}
