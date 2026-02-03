package Day6;

import java.util.Arrays;

public class UniquePathsII {
    int helper(int[][] matrix,int i,int j,int m,int n,int dp[][]){
        if(i>m || j>n || matrix[i][j]==1) return 0;
        if(i==m && j==n) return 1;
        if(dp[i][j]!=-1)return dp[i][j];

        int right = helper(matrix,i,j+1,m,n,dp);
        int down = helper(matrix,i+1,j,m,n,dp);

        dp[i][j]=right+down;

        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(obstacleGrid,0,0,m-1,n-1,dp);
    }
}
