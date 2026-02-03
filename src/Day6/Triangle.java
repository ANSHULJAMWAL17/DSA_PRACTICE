package Day6;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    int helper(List<List<Integer>> triangle,int i,int j,int[][] dp){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }

        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];

        int include= triangle.get(i).get(j) + helper(triangle,i+1,j+1,dp);
        int exclude= triangle.get(i).get(j) + helper(triangle,i+1,j,dp);

        dp[i][j]=Math.min(include,exclude);

        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int dp[][]=new int[m][m];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return helper(triangle,0,0,dp);
    }
}
