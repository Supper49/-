class Solution {
    public int searchInsert(int[] nums, int target) {
            int index = 0;
            for(int i:nums){
                if (i==target){
                    return index;
                }
                if(i>target){
                    return index;
                }
                index++;
                

            }
            return index;
        }
}
