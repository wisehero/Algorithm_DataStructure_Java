package inflearn_algoritm.string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(Solution(input));

    }

    public static String Solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder(str);

        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
            answer += "YES";
        } else {
            answer += "NO";
        }

        return answer;
    }
}
