package Day6;

import java.util.Arrays;

public class MinimumPathSum {
    public int helper(int[][] grid,int i,int j,int m,int n,int[][] dp){
        if(i>m || j>n) return 100000;
        if(i==m && j==n){
            return grid[i][j];
        }
        if(dp[i][j]!=-1)return dp[i][j];

        int right=grid[i][j]+helper(grid,i,j+1,m,n,dp);
        int down=grid[i][j]+helper(grid,i+1,j,m,n,dp);

        dp[i][j]=Math.min(right,down);

        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(grid,0,0,m-1,n-1,dp);
    }
}
