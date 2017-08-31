package algorithms.implementation;

import java.util.Scanner;

public class Taum_And_BDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long result = 0;
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            if (y + z < x) {
                result = (w * y) + (b * (y + z));
            } else if (x + z < y) {
                result = (b * x) + (w * (x + z));
            } else {
                result = (b * x) + (w * y);
            }
            System.out.println(result);

        }
    }
}

