class Solution {
    public String countAndSay(int n) {
            if (n==1){
                return "1";
            }else {
                StringBuffer sb = new StringBuffer();
                int i = 0;
                int j = 1;
                String lasts = countAndSay(n-1);
                while (j<lasts.length()){
                    if(lasts.charAt(i)!=lasts.charAt(j)){
                        sb.append(j-i).append(lasts.charAt(i));
                        System.out.println(sb.toString());
                        i=j;
                    }
                    j++;

                }
                sb.append(j-i).append(lasts.charAt(i));
                return sb.toString();

            }

        }
}
