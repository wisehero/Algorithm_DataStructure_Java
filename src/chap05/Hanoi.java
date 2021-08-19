package chap05;

import java.util.Scanner;

public class Hanoi {
    //no개의 원반을 x번 기둥에서 y번 기둥으로 옮김

    static void move(int no, int x, int y) {
        // 원반은 2개 이상일 때만 의미가 있으므로
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        /**
         * move(3,1,3)
         * move(2,1,2)
         * move(1,1,3) -> sout 원반[1]을 1기둥에서 3기둥으로 옮김
         * move(2,1,2) -> sout 원반[2]를 1기둥에서 2기둥으로 옮김
         * move(1,3,2) -> sout 원반[1]를 3기둥에서 2기둥으로 옮김
         */

        System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");

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
