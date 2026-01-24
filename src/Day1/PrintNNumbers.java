package Day1;

public class PrintNNumbers {
    void printNos(int N) {
        if(N==0) return;

        System.out.print(N+" ");

        printNos(N-1);
    }
}
