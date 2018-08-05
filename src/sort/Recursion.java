package sort;

public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.recursionForSumOfNumber(10));
        System.out.println(recursion.recursionForFactorial(5));
    }

    private int recursionForSumOfNumber(int number) {
        if (number == 0)
            return 0;
        return recursionForSumOfNumber(number - 1) + number;
    }

    private int recursionForFactorial(int number) {
        if (number == 0)
            return 1;
        return recursionForFactorial(number - 1) * number;
    }
}
