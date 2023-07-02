//REMOVE DUPLICATES

import java.lang.*;
import java.util.Scanner;

public class Main {
    public static String removeDuplicates(String s) {
        if (s.length() < 2) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return removeDuplicates(s.substring(1));
        } else {
            return s.charAt(0) + removeDuplicates(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(removeDuplicates(s));
    }
}
