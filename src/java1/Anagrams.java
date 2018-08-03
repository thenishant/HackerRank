package java1;

import java.util.Arrays;

public class Anagrams {
    private static boolean isAnagram(String a, String b) {
        a = "anagram";
        b = "margana";
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char Aarr[] = new char[26];
        char Barr[] = new char[26];

        for(int i=0 ; i<a.length() ; i++){
            Aarr[a.charAt(i)-97]++;
        }
        for (int i=0 ; i<b.length() ; i++) {
            Barr[b.charAt(i) - 97]++;
        }

        return Arrays.equals(Aarr, Barr);
    }

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        ret = isAnagram(a, b);
        System.out.println(isAnagram("anagram", "margana"));//;) ? "Anagrams" : "Not Anagrams");
    }
}
