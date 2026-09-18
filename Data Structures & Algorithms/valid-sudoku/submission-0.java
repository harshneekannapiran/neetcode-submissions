class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                    if(!set.contains(board[i][j]))
                        set.add(board[i][j]);
                    else
                        return false;
                }
            }
        }
         for(int i=0;i<board.length;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                else{
                    if(!set.contains(board[j][i]))
                        set.add(board[j][i]);
                    else
                        return false;
                }
            }
        }
        for(int startrow=0;startrow<9;startrow+=3){
            for(int startcol=0;startcol<9;startcol+=3){
                HashSet<Character> set=new HashSet<>();
                for(int i=startrow;i<startrow+3;i++){
                  for(int j=startcol;j<startcol+3;j++){
                        if(board[i][j]=='.'){
                            continue;
                }
                else{
                    if(!set.contains(board[i][j]))
                        set.add(board[i][j]);
                    else
                        return false;
                }
                   }
                }
            }
        }
        return true;
    }
}
