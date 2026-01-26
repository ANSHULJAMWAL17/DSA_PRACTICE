package Day3;

public class Fibonacci {
    int helper(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return helper(n-1) + helper(n-2);
    }
    public int nthFibonacci(int n) {

        return helper(n);
    }
}
