package Day4;

import java.util.Arrays;

public class FriendsPairingProblem {
    public long helper(int n,long dp[]){
        if(n<=1) return 1;
        if(n==2) return 2;
        if(dp[n]!=-1) return dp[n];
        dp[n]=helper(n-1,dp)+(n-1)*helper(n-2,dp);
        return dp[n];
    }
    public long countFriendsPairings(int n) {
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
}
