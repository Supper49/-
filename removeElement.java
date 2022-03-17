class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0,j=0,count=0;
        while (j<nums.length){
            if(nums[j]==val){
                j++;
            }else {
                nums[i]=nums[j];
                i++;
                count = count+1;
                j++;
            }

        }
        return count;
    }
}
