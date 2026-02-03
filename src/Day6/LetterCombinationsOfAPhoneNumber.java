package Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    void backtrack(String digits,int i,StringBuilder sb,List<String> res,   Map<Character,String> digitsToLetter){
        if(i==digits.length()){
            res.add(sb.toString());
            return;
        }

        String letters=digitsToLetter.get(digits.charAt(i));
        for(char letter: letters.toCharArray()){
            sb.append(letter);
            backtrack(digits,i+1,sb,res,digitsToLetter);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }
}
