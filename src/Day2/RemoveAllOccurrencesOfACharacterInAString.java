package Day2;

public class RemoveAllOccurrencesOfACharacterInAString {
    void helper(StringBuilder s,char c,int i){
        if(i==s.length()) return;

        if(s.charAt(i)==c){
            s.deleteCharAt(i);
            helper(s,c,i);
        }
        else{
            helper(s,c,i+1);
        }
    }
    public void removeCharacter(StringBuilder s, char c) {

        helper(s,c,0);

    }
}
