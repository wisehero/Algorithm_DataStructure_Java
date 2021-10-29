package inflearn_algoritm.string;

// 1-2번 문제

import java.util.Scanner;

public class UpperAndLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] strArr = input.split("");
        char tmp;
        String output = "";

        for (int i = 0; i < strArr.length; i++) {
            tmp = input.charAt(i);
            if (Character.isUpperCase(tmp)) {
                output += Character.toLowerCase(tmp);
            } else {
                output += Character.toUpperCase(tmp);
            }
        }
        System.out.println(output);
    }
}
