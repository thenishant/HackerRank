package implementation;

import java.util.Scanner;

public class Beautiful_Day_At_Movies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int k = s.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            int rev = reverse(i);
            if ((Math.abs(i - rev)) % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int reverse(int number) {
        String value = String.valueOf(number);
        String val = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            val = val + String.valueOf(value.charAt(i));
        }
        return Integer.parseInt(val);
    }
}
