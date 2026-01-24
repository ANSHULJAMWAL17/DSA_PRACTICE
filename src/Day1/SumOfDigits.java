package Day1;

public class SumOfDigits {
    static int sumOfDigits(int n) {
        if(n/10==0) return n%10;

        return n%10+sumOfDigits(n/10);

    }
}
