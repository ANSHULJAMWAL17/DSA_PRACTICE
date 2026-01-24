package Day1;

public class Palindrome {
    int check(int n,int rev){
        if(n==0) return rev;
        rev=rev*10+n%10;

        return check(n/10,rev);
    }
    public boolean isPalindrome(int n) {

        return n == check(n,0);
    }
}
