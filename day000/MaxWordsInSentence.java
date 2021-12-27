import java.util.Scanner;

public class MaxWordsInSentence {

    public static int numOfWords(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max(max, numOfWords(sentences[i]));
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextLine();
        }
        System.out.println(mostWordsFound(arr));
    }
}
