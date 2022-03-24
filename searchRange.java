class Solution {
    public int[] searchRange(int[] nums, int target) {
            int[] wei=new int[]{-1,-1};
            int[] wei2 =new int[]{0,0};
            if(nums.length==1){
                if(nums[0]==target){
                    return wei2;
                }
                return wei;
            }
            int index = 0;
            for (int i:nums){
                if (i==target){
                    wei[0]=index;
                    for(int z =index;z< nums.length;z++){
                        if(nums[z]!=target){
                            wei[1]=z-1;
                            return wei;
                        }

                    }
                    wei[1]=nums.length-1;
                    return wei;
                }
                index++;
            }
            return wei;
    }
}
