class Solution {
    public int trap(int[] height) {
            int max = 0;
            int maxindex = 0;
            int water = 0;
            for(int i =0;i<height.length;i++){
                if(height[i]>max){
                    max = height[i];
                    maxindex =i;
                }
            }
            for(int i =0;i<maxindex;i++){
                if(height[i]>height[i+1]){
                    for(int j =i;j<maxindex;j++){
                        if(height[i]>height[j+1]){
                            water= water+height[i]-height[j+1];
                        }
                        if(height[i]<=height[j+1]){
                            i=j;
                            break;
                        }
                        
                    }
                }
            }
            for(int i =height.length-1;i>maxindex;i--){
                if(height[i]>height[i-1]){
                    for(int j =i;j>maxindex;j--){
                        if(height[i]>height[j-1]){
                            water= water+height[i]-height[j-1];
                        }
                        if(height[i]<=height[j-1]){
                            i=j;
                            break;
                        }
                        
                    }
                }


            }
            return water;
    }
}
