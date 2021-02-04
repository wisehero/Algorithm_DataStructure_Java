package chap02.Practice;

// 메서드 dayOfYear를 변수 i와 days 없이 구현하세요. while 문을 사용하세요.

import java.util.Scanner;

public class DayOfYearPractice {
    static int [][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    // 서기 Yeardms 윤년인가? (윤년: 1 / 평년: 0)

    static int isLeap(int year) {
        return (year%4 == 0 && year% 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
       int fm = 1; // 1월 부터 시작
       int x = d;  // 일 수
       while (fm < m) {
           x += mdays[isLeap(y)][fm-1];
           fm++;
       }
       return x;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년: "); int year = stdIn.nextInt(); // 년
            System.out.print("월: "); int month = stdIn.nextInt(); // 월
            System.out.print("일: "); int day = stdIn.nextInt(); // 일

            System.out.printf("그 해 %d일째입니다. \n", dayOfYear(year, month, day));

            System.out.print("한번 더 할까요 ? (1.예 / 0.아니오)");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
