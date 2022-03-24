public class Solution {

    List<List<Integer>> lists = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            int index = 0;
            boolean[] used = new boolean[nums.length];
            List<Integer> temp = new ArrayList<>();
            Deque<Integer> dq = new ArrayDeque<>();
            dfs(nums,temp,used,dq);
            return lists;

        }
        public void dfs(int[] nums,List<Integer> temp,boolean[] used,Deque<Integer> dq){
            if(dq.size() == nums.length){
                lists.add(new ArrayList<>(dq));
                return;
            }
            for(int i =0 ;i<nums.length;i++){
                if(!used[i]){
                    dq.addLast(nums[i]);
                    used[i]=true;
                    dfs(nums,temp,used,dq);
                    used[i]=false;
                    dq.removeLast();
                }
            }

        }
}
