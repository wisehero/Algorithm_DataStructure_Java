package inflearn_algoritm.string;

import java.util.Scanner;

/**
 * 각 문자열이 알파벳인지 특수문자인지 알아야 한다.
 * 만약 둘 다 알파벳이라면 스왑해야 한다.
 * 그리고 각 포인터의 값을 올려준다.
 * 둘 다 특수문자라면 스왑 없이 포인터 값만 둘 다 올려준다.
 */

public class onlyAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(Solution(input));

    }

    public static String Solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            // 알파벳이 아닐 때
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }
}
