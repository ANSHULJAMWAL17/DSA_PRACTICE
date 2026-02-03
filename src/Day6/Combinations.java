package Day6;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public void helper(int n,int k,int i,List<List<Integer>> res,List<Integer> list){
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int j=i;j<=n;j++){
            list.add(j);
            helper(n,k,j+1,res,list);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        helper(n,k,1,res,list);

        return res;
    }
}
