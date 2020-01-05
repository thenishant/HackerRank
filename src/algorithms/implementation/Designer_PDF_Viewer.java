package algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class Designer_PDF_Viewer {

    static int designerPdfViewer(int[] h, String word) {
        int length = word.length();
        int[] h1 = new int[length];
        for (int i = 0; i < length; i++) {
            h1[i] = ((word.charAt(i)) - 96);
            int i1 = h[h1[i] - 1];
        }
        return h1[length - 1] * length;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }


}
