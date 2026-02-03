package Day6;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    void helper(String s,List<String> res,int i,StringBuilder sb){
        if(i==s.length()){
            res.add(sb.toString());
            return;
        }

        char ch=s.charAt(i);

        if(Character.isLetter(ch)){

            sb.append(Character.toUpperCase(ch));
            helper(s,res,i+1,sb);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toLowerCase(ch));
            helper(s,res,i+1,sb);
            sb.deleteCharAt(sb.length()-1);

        }else{
            sb.append(ch);
            helper(s,res,i+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCasePermutation(String s) {

        List<String> res=new ArrayList<>();

        helper(s,res,0,new StringBuilder());

        return res;
    }
}
