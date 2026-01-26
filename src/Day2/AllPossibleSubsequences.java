package Day2;

import java.util.TreeSet;

public class AllPossibleSubsequences {
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static void helper(String s, TreeSet<String> set, int i, int n, StringBuilder str){
        if(i == n){
            if(str.length() >= 2 && isVowel(str.charAt(0)) && !isVowel(str.charAt(str.length() - 1))){
                set.add(str.toString());
            }
            return;
        }
        str.append(s.charAt(i));
        helper(s,set,i+1,n,str);
        str.deleteCharAt(str.length() - 1);
        helper(s,set,i+1,n,str);
    }
    static TreeSet<String> allPossibleSubsequences(String s) {

        TreeSet<String> set=new TreeSet<>();
        StringBuilder str=new StringBuilder();
        helper(s,set,0,s.length(),str);

        return set;
    }
}
