package Day2;

public class MovesZeroToEnd {
    void helper(int arr[],int i,int j){
        if(j == arr.length) return;

        if(arr[j]==0){
            helper(arr,i,j+1);
            return;
        }

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        helper(arr,i+1,j+1);
    }
    void pushZerosToEnd(int[] arr) {

        helper(arr,0,0);

    }
}
