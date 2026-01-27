package Day4;

public class SubsetSum {
    static Boolean helper(int arr[],int sum,int target,int i,Boolean dp[][]){
        if (target == sum) return true;
        if (i == arr.length) return false;
        if(dp[i][target]!=null)return dp[i][target];

        boolean include=false;
        if(target+arr[i]<=sum){
            include=helper(arr,sum,target+arr[i], i + 1,dp);
        }

        boolean exclude=helper(arr, sum,target, i + 1,dp);

        dp[i][target]= include||exclude;

        return dp[i][target];
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        Boolean dp[][]=new Boolean[n][sum+1];
        return helper(arr,sum,0,0,dp);

    }
}
