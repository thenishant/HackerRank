package algorithms.implementation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Designer_PDF_Viewer {

    static int designerPdfViewer(int[] h, String word) {
        int lengthOfTheWord = word.length();
        int[] positionOfChar = new int[lengthOfTheWord];
        int[] sizeOfChar = new int[lengthOfTheWord];
        IntStream.range(0, lengthOfTheWord).forEach(i -> {
            positionOfChar[i] = (word.charAt(i) - 96);
            sizeOfChar[i] = h[positionOfChar[i] - 1];
        });
        Arrays.sort(sizeOfChar);
        return sizeOfChar[lengthOfTheWord - 1] * lengthOfTheWord;
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
