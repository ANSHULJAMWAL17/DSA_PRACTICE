package Day1;

public class ReverseDigits {
    public int reverse(int n,int rev){
        if(n == 0)return rev;
        rev=rev*10+ n%10;
        return reverse(n/10,rev);
    }
    public int reverseDigits(int n) {

        return reverse(n,0);
    }
}
