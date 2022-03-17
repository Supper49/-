class Solution {
        public static String intToRoman(int num) {
            int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
            StringBuffer sb = new StringBuffer();
            for (int i=0;i<13;i++){
                while (num-values[i]>=0){
                    num =num-values[i];
                    sb.append(reps[i]);
                }
            }
            return sb.toString();
        }
    }
