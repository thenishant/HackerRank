package algorithms.implementation;


import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        int row = (int) Math.floor(Math.sqrt(length));
        int column = (int)Math.ceil(Math.sqrt(length));
        if (row * column < input.length())
            row = column;
        for (int i = 0; i < column; i++) {
            for (int k = i; k < length; k += column) {
                System.out.print(input.charAt(k));
            }
            System.out.print(" ");
        }
    }
}
