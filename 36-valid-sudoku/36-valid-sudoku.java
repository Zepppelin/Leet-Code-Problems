class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
       Set<String> seen = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
              char curr_value = board[i][j];
              if(curr_value!='.')  
              {
                  if(!seen.add(curr_value+"seen in row"+i) ||
                     !seen.add(curr_value+"seen in column"+j) ||
                     !seen.add(curr_value+"seen in subbox"+i/3+"-"+j/3)) return false;
              }
            }
        }
        return true;
    }
}
