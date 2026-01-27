package Day4;

public class TargetSum {
    static int helper(int N,int arr[],int target,int i,int sum){
        if(i == N){
            return sum == target ? 1 : 0;
        }
        int include=helper(N,arr,target,i+1,sum+arr[i]);

        int exclude=helper(N,arr,target,i+1,sum-arr[i]);

        return include+exclude;
    }

    static int findTargetSumWays(int N, int[] A, int target) {
        return helper(N,A,target,0,0);
    }
}
