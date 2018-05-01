package algorithms.implementation;

import java.util.Scanner;

public class Find_Digits {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            String singleNum[] = String.valueOf(number[i]).split("(?<=.)");
            for (int j = 0; j < singleNum.length; j++) {
                try {
                    if (number[i] % Integer.parseInt(singleNum[j]) == 0) {
                        count++;
                    }
                } catch (ArithmeticException e) {

                }
            }
            System.out.println(count);
            //count=0;
        }
    }
}
