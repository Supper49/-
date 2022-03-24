class Solution {
    public int jump(int[] nums) {
            int step = 0;
            int end = 0;
            int maxjump = 0;
            for (int i =0;i<nums.length-1;i++){
                maxjump = Math.max(maxjump,i+nums[i]);
                if(i==end){
                    end = maxjump;
                    step++;
                }
            }
            return step;
    }
}
