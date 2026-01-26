package Day2;

public class CountOccurrence {
    int helper(int arr[],int x,int i,int count){
        if(i > arr.length-1) return count;

        if(arr[i]==x){
            count++;
        }

        return helper(arr,x,i+1,count);
    }
    int countFreq(int[] arr, int target) {

        return helper(arr,target,0,0);

    }
}
