class Solution {
    public boolean isPalindrome(int x) {
        int n =0;
        int z =x;
        if(x<0){
            return false;
        }
        while(z!=0){
            n=n*10+z%10;
            z = z/10;
        }
        return true ? n==x:false;

    }
}
