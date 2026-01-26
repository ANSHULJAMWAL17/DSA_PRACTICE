package Day2;

public class FindElementInArray {
    int getIndex(int arr[],int x,int n,int i){
        if(i > n) return -1;

        if(arr[i]==x) return i;

        return getIndex(arr,x,n,i+1);
    }
    public int search(int arr[], int x) {

        return getIndex(arr,x,arr.length-1,0);
    }
}
