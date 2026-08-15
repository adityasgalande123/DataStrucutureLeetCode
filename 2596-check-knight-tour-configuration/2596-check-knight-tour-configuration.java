class Solution {

    public boolean isValid(int[][] grid,int r,int c, int exp_val,int n){

        //invalid base case 
        if(r<0 || c<0 || r>=n || c>=n ||grid[r][c] !=exp_val ){
            return false;
        }
        // true base case
        if(exp_val == n*n-1){
            return true;
        }

        // 8 moves
       boolean ans1= isValid(grid,r-2,c+1,exp_val+1,n);
       boolean ans2= isValid(grid,r-1,c+2,exp_val+1,n);
       boolean ans3= isValid(grid,r+1,c+2,exp_val+1,n);
       boolean ans4= isValid(grid,r+2,c+1,exp_val+1,n);
       boolean ans5= isValid(grid,r+2,c-1,exp_val+1,n);
       boolean ans6= isValid(grid,r+1,c-2,exp_val+1,n);
       boolean ans7= isValid(grid,r-1,c-2,exp_val+1,n);
       boolean ans8= isValid(grid,r-2,c-1,exp_val+1,n);

        return ans1 || ans2 || ans3 || ans4 || ans5|| ans6 || ans7 || ans8 ;

    }
    public boolean checkValidGrid(int[][] grid) {
        
       return  isValid(grid,0,0,0,grid.length);
    }
}