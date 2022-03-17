class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0,j=0,count=1;
        while (j+1<nums.length){
            if(nums[j]==nums[j+1]){
                j++;
            }else {
                nums[i+1]=nums[j+1];
                i++;
                count = count+1;
                j++;
            }

        }
        return count;
    }
}
