package Day1;

public class MaxElement {
    static int helper(int arr[],int max,int i){
        if(i<0) return max;

        max=Math.max(max,arr[i]);

        return helper(arr,max,i-1);
    }
    public static int largest(int[] arr) {

        return helper(arr,Integer.MIN_VALUE,arr.length-1);
    }
}
