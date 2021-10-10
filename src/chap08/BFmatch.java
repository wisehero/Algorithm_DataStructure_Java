package chap08;

import java.util.Scanner;
// 브루트 포스법으로 문자열을 검색하는 프로그램

public class BFmatch {

    static int bfMatch(String txt, String pat) {
        int pt = 0; // txt 커서
        int pp = 0; // pat 커서

        // 텍스트의 길이가 커서의 위치와 같지않고 pat의 길이와 pat의 커서가 같지 않을 때 반복
        while (pt != txt.length() && pp != pat.length()) {
            // 만약 텍스트의 문자와 패턴의 문자가 같으면
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1; // 다르면 pt는 한 칸 뒤로 물러서고
                pp = 0; // pp는 초기화된다.
            }
        }
        // pp의 길이가 패턴의 길이와 같아지면
        if (pp == pat.length()) {
            return pt - pp; // 검색 성공
        }
        return -1; // 아니면 검색 실패
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("텍스트 : ");
        String s1 = stdIn.next();

        System.out.print("패턴 : ");
        String s2 = stdIn.next();

        int idx = bfMatch(s1, s2);

        if (idx == -1)
            System.out.println("텍스트에 패턴이 없습니다.");
        else {
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트 : " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
        }
    }
}
