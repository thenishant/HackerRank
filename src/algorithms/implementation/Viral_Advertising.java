package algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class Viral_Advertising {
    static int viralAdvertising(int n) {
        int totalLikes = 2;
        int todayLikes = 2;
        if (n == 1)
            return todayLikes;
        for (int i = 1; i < n; i++) {
            todayLikes = (todayLikes * 3) / 2;
            totalLikes += todayLikes;
        }
        return totalLikes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
