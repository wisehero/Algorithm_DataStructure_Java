package chap02.Practice;

import java.util.Scanner;

public class cardConvPractice2 {
    static int cardConvRev(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 뒤의 자릿수
        char[] cno = new char[32]; // 변환 뒤의 각 자리를 저장하는 문자인 배열

        System.out.println("10진수를 기수변환합니다.");
        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = stdIn.nextInt();
        } while (no < 0);

        do {
            System.out.print("어떤 진수로 변환할까요? (2~36) : ");
            cd = stdIn.nextInt();
        } while (cd < 2 || cd > 36);

        System.out.println();
        System.out.println(cd + "|      " + no);
        do {
            System.out.println(" + ------------");
            System.out.println(cd + "|      " + no / cd + " ∙∙∙ " + no % cd);
            no /= cd;
        } while (no != 0);

        dno = cardConvRev(no, cd, cno);

        System.out.print(cd + "진수로는 ");
        for (int i = dno-1; i >= 0; i--) {
            System.out.println("입니다.");
        }
    }
}
