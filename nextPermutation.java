class Solution {
    public static void nextPermutation(int[] nums) {
            int len =nums.length;
            for (int i=len-1;i>0;i--){
                if(nums[i]>nums[i-1]){
                    for (int j =len-1;j>i-1;j--){
                        if(nums[j]>nums[i-1]){
                            swap(nums,i-1,j);
                            Arrays.sort(nums,i-0,len-0);
                            return;
                        }

                    }
                }
            }
            Arrays.sort(nums);
            return;

        }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
