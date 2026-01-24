package Day1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        System.out.println(factorial(n, fact));

    }

    private static int factorial(int n, int fact) {

            if(n==0 || n==1) return fact;

            return factorial(n-1,fact*n);
    }
}
