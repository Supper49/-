class Solution {
    List<List<Integer>> list = new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                if (i > begin && candidates[i] == candidates[i - 1]) {
                    continue;
                }

                dl.addLast(candidates[i]);
                dfs(candidates,i+1,target-candidates[i],dl);
                dl.removeLast();

            }


        }
}
