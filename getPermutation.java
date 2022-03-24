class Solution {
    List<List<Integer>> lists = new ArrayList<>();
        public String getPermutation(int n,int k) {
            int index = 0;
            int[] nums = new int[n];
            for(int i = 0;i<n;i++){
                nums[i] = i+1;
            }
            boolean[] used = new boolean[nums.length];
            List<Integer> temp = new ArrayList<>();
            Deque<Integer> dq = new ArrayDeque<>();
            dfs(nums,temp,used,dq,k);
            return lists.get(k-1).toString().replace("[","").replace("]","").replaceAll(",","").replace(" ", "");

        }
        public void dfs(int[] nums,List<Integer> temp,boolean[] used,Deque<Integer> dq,int k){
            if(lists.size() == k){
                return;
            }
            if(dq.size() == nums.length){
                lists.add(new ArrayList<>(dq));
                return;
            }
            for(int i =0 ;i<nums.length;i++){
                if(!used[i]){
                    dq.addLast(nums[i]);
                    used[i]=true;
                    dfs(nums,temp,used,dq,k);
                    used[i]=false;
                    dq.removeLast();
                }
            }

        }
}
