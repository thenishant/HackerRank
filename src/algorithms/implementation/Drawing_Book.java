package algorithms.implementation;

import java.util.Scanner;

public class Drawing_Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }

    private static int solve(int n, int p) {
        return Math.min(p / 2, n / 2 - p / 2);
    }
}
