package Day2;

import java.util.ArrayList;

public class FindFirstAndLastOccurrence {
    ArrayList<Integer> helper(int arr[],int x,int i, ArrayList<Integer> res){
        if(i > arr.length-1) return res;

        if(arr[i]==x){
            if(res.get(0)==-1){
                res.add(0,i);
            }
            res.add(1,i);
        }

        return helper(arr,x,i+1,res);
    }
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(-1);
        list.add(-1);

        helper(arr,x,0,list);
        return list;
    }
}
