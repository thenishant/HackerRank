package algorithms.implementation;

import java.util.Scanner;

public class Sequence_Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(number[i]);
        }
    }
}