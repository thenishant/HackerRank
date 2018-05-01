package algorithms.implementation;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Drawing_Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }

    private static int solve(int n, int p) {
        int count = 0;
        if (abs(0 - p) < abs(n - p)) {
            for (int i = 0; i < p; i++) {
                count++;
            }
//        } else {
//            for (int i = p; i > 0; i -= 2) {
//                count++;
//            }
        }
        return count;
    }
}
