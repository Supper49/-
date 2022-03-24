class Solution {
    public boolean isValidSudoku(char[][] board) {
            int [][]row  =new int[9][10];
            int [][]col  =new int[9][10];
            int [][]box  =new int[9][10];
            for(int x =0;x<9;x++){
                for(int y =0;y<9;y++){
                    if(board[x][y] == '.'){
                        continue;
                    }
                    
                    int num = board[x][y]-'0';
                    
                    if(row[x][num]==1){
                        return false;
                    }
                    
                    if(col[y][num]==1){
                        return false;
                    }
                    
                    if(box[x/3+(y/3)*3][num]==1){
                        return false;
                    }
                    
                    row[x][num]=1;
                    col[y][num]=1;
                    box[x/3+(y/3)*3][num]=1;
                    
                }
            }
            return true;
        }
}
