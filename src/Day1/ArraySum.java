package Day1;

public class ArraySum {
    int helper(int arr[],int sum,int i){
        if(i<0) return sum;

        sum+=arr[i];

        return helper(arr,sum,i-1);
    }
    int arraySum(int arr[]) {

        return helper(arr,0,arr.length-1);
    }
}
