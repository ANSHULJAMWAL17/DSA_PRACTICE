package Day5;

public class CoinChange {
    int helper(int[] coins,int N,int sum,int i,int count){
        if(sum>N) return Integer.MAX_VALUE;
        if(sum==N){
            return count;
        }
        if(i == coins.length){
            return Integer.MAX_VALUE;
        }

        int include=helper(coins,N,sum+coins[i],i,count+1);
        int exclude=helper(coins,N,sum,i+1,count);

        return Math.min(include,exclude);
    }
    public int coinChange(int[] coins, int N) {
        int a= helper(coins,N,0,0,0);

        if(a==Integer.MAX_VALUE)return -1;

        return a;
    }
}
