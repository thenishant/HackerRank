package algorithms.implementation;

import java.util.Scanner;

public class Viral_Advertising {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 0;
        for(int i=2;i<n+2;i++){
            result+=i;
        }
        int sum=0;
        for(int i =2;i<2+n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
