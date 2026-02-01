package Day5;

import java.util.Arrays;

public class Knapsack {
    int helper(int W,int val[],int wt[],int i,int capacity,int dp[][]){
        if(i == val.length) return 0;

        if(dp[i][capacity]!=-1) return dp[i][capacity];
        int include=0;
        if(capacity+wt[i]<=W){
            include=val[i]+ helper(W,val,wt,i+1,capacity+wt[i],dp);
        }

        int exclude=helper(W,val,wt,i+1,capacity,dp);

        dp[i][capacity]=Math.max(include,exclude);

        return dp[i][capacity];
    }
    public int knapsack(int W, int val[], int wt[]) {
        int dp[][]=new int[val.length][W+1];
        for(int i=0;i<val.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(W,val,wt,0,0,dp);

    }
}
