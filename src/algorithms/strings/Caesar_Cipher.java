package algorithms.strings;

import java.util.Scanner;

public class Caesar_Cipher {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String newWord = "";
        String word = s.next();
        int k = s.nextInt();
        for (int i = 0; i < n; i++) {
            int ascii = word.charAt(i);
            if (ascii + k >= 90 && ascii + k <= 122) {
                int result = ascii + k - 90;
                System.out.println((char) (result + 64));
            } else if (ascii + k >= 122) {
                int result = ascii + k - 122;
                System.out.println((char) (result + 96));
            }
        }
    }
}