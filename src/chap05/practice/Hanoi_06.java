package chap05.practice;

import java.util.Scanner;

/**
 * 숫자가 아닌 문자열로 기둥 이름을 출력하도록 프로그램을 수정
 * 예를 들어 'A 기둥' 'B 기둥' 'C 기둥'과 같이 출력
 */

public class Hanoi_06 {

    //no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static String[] name = {"A기둥", "B기둥", "C기둥"};

    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }


        System.out.println("원반[" + no + "]를 " + name[x - 1] + "에서 " + name[y - 1] + "으로 옮김");

        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반 개수 :");
        int n = stdIn.nextInt();

        move(n, 1, 3);
    }
}


