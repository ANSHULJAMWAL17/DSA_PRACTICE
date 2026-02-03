package Day6;

public class CherryPickUp {
    int helper(int grid[][],int row1,int col1,int row2,int col2,int m,int n){
        if(row1>m || col1>n || row2>m || col2>n) return  Integer.MIN_VALUE;
        if(grid[row1][col1] == -1 || grid[row2][col2] == -1) return  Integer.MIN_VALUE;

        if(row1==m && col1==n && row2==m && col2==n){
            return grid[m][n];
        }

        int cherry=grid[row1][col1];
        if(row1!=row2 || col1!=col2){
            cherry+=grid[row2][col2];
        }

        int rightRight=helper(grid,row1,col1+1,row2,col2+1,m,n);
        int downDown=helper(grid,row1+1,col1,row2+1,col2,m,n);
        int rightDown=helper(grid,row1,col1+1,row2+1,col2,m,n);
        int downRight=helper(grid,row1+1,col1,row2,col2+1,m,n);

        return cherry + Math.max(
                Math.max(rightRight, rightDown),
                Math.max(downRight, downDown)
        );
    }
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans = helper(grid,0,0,0,0,m-1,n-1);
        return Math.max(0, ans);
    }
}
