package Day4;

public class PartitionEqualSubsetSum {
    static boolean helper(int arr[],int n,int sum1,int sum2,int i,Boolean dp[][]){

        if(i==n){
            return sum1==sum2? true:false;
        }

        if(dp[i][sum1]!=null){
            return dp[i][sum1];
        }

        boolean include=helper(arr,n,sum1+arr[i],sum2,i+1,dp);
        boolean exclude=helper(arr,n,sum1,sum2+arr[i],i+1,dp);

        dp[i][sum1]= include || exclude;

        return dp[i][sum1];
    }
    static boolean equalPartition(int arr[]) {
        int sum=0;
        for(int x : arr) sum += x;
        Boolean dp[][]=new Boolean[arr.length][sum+1];

        return helper(arr,arr.length,0,0,0,dp);

    }
}
