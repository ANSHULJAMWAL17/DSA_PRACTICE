package Day3;

import java.util.Arrays;

public class UniquePaths {
    //    it is giving tle so i use dp here
    int helper(int m,int n,int i,int j,int dp[][]){
        if(i>m || j>n) return 0;
        if(i==m && j==n) return 1;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=helper(m,n,i+1,j,dp)+helper(m,n,i,j+1,dp);

        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(m-1,n-1,0,0,dp);
    }
}
