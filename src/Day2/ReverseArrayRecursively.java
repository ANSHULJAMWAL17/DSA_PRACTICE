package Day2;

public class ReverseArrayRecursively {
    void helper(int arr[],int i,int j){
        if(i > j) return;

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        helper(arr,i+1,j-1);
    }
    public void reverseArray(int arr[]) {

        helper(arr,0,arr.length-1);

    }
}
