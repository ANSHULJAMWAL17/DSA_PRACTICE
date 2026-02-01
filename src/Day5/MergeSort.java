package Day5;

public class MergeSort {
    void merge(int arr[],int l,int mid,int r){
        int temp[]=new int[r-l+1];
        int left=l;
        int right=mid+1;

        int z=0;
        while(left<=mid && right<=r){
            if(arr[left]<arr[right]){
                temp[z++]=arr[left];
                left++;
            }else{
                temp[z++]=arr[right];
                right++;
            }
        }

        while(left<=mid){
            temp[z++]=arr[left];
            left++;
        }
        while(right<=r){
            temp[z++]=arr[right];
            right++;
        }

        z=0;

        for(int i=l;i<=r;i++){
            arr[i]=temp[z++];
        }
    }
    void mergeSort(int arr[], int l, int r) {
        if(l>=r) return;
        int mid=l+(r-l)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }
}
