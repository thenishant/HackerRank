package algorithms.implementation;

import java.io.*;

public class Day_Of_Programmer {
    static String dayOfProgrammer(int year) {
        if ((year % 4 == 0) & (year % 100 != 0) | (year % 400 == 0))
            return "12.09." + year;
        if (year == 1918)
            return "26.09.1918";
        else
            return "13.09." + year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
