import java.util.Scanner;

public class Fibonacci {

    public static int fibo_recursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibo_recursive(n - 1) + fibo_recursive(n - 2);
    }

    public static int fibo_memoized(int n, int[] qb) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (qb[n] != 0) {  //qb = question bank i.e. if a call already called then it will just return result of that call rather than solving it again
            return qb[n];
        }
        int fib = fibo_memoized(n - 1, qb) + fibo_memoized(n - 2, qb);
        qb[n] = fib;  // Storing call if it is not called already
        return fib;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = fibo_recursive(n);
        System.out.println(res);

        int res_op = fibo_memoized(n, new int[n + 1]);
        System.out.println(res_op);

        scn.close();
    }
}
