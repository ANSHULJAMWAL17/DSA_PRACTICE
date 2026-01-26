package Day2;

public class CheckIfArrayIsSorted {
    boolean helper(int arr[],int i,int n){
        if(i == n) return true;

        if(arr[i]>arr[i+1]) return false;

        return helper(arr,i+1,n);
    }
    public boolean isSorted(int[] arr) {

        return helper(arr,0,arr.length-1);
    }
}
