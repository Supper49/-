class Solution {
    List<List<Integer>> list = new ArrayList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            Deque<Integer> dl = new ArrayDeque<>();
            dfs(candidates,0, target,dl);
            return list;


        }

        public void dfs(int[] candidates,int begin, int target,Deque<Integer> dl){
            if(target==0){
                list.add((new ArrayList<>(dl)));
                return;
            }

            for (int i =begin;i<candidates.length;i++){
                if(target-candidates[i]<0){
                    break;
                }

                dl.addLast(candidates[i]);
                dfs(candidates,i,target-candidates[i],dl);
                dl.removeLast();

            }


        }
}
