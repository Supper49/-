class Solution {
    public String convert(String s, int numRows) {
        int lie = numRows-1;
        StringBuffer sb = new StringBuffer();
        if (numRows == 1){
            return s;
        }

        for (int i =0; i<s.length();i=i+2*lie){
            sb.append(s.charAt(i));
        }

        for (int i =1; i<lie; i++){
            for (int j =0;j*lie*2+i<s.length();j++){
                sb.append(s.charAt(j*lie*2+i));
                if (2*lie*(j+1)-i<s.length()){
                    sb.append(s.charAt(2*lie*(j+1)-i));
                }
            }

        }

        for (int i =lie; i<s.length();i=i+2*lie){
            sb.append(s.charAt(i));
        }
        return sb.toString();

    }
}
