package Day3;

import java.util.Arrays;

public class DiceThrow {
    //    it is giving tle so i use dp here
    static int helper(int m,int n,int x,int sum,int i,int dp[][]){
        if(sum>x)return 0;
        if(i==n){
            if(sum==x)return 1;
            return 0;
        }

        if(dp[i][sum]!=-1)return dp[i][sum];
        int count=0;
        for(int j=1;j<=m;j++){
            count+=helper(m,n,x,sum+j,i+1,dp);
            dp[i][sum]=count;
        }

        return dp[i][sum];
    }
    static int noOfWays(int m, int n, int x) {
        int dp[][]=new int[n+1][x+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(m,n,x,0,0,dp);

    }
}
