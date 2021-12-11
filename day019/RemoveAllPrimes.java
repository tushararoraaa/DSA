import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllPrimes {

    public static boolean isPrime(int num) {
        boolean isprime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void remove(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (isPrime(arr.get(i))) {
                arr.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scn.nextInt());
        }
        remove(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
