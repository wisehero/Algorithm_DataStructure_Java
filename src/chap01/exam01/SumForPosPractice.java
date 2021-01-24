package chap01.exam01;

// 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
// 단 b는 a보다 커야합니다.

import java.util.Scanner;

public class SumForPosPractice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();

        if (b <= a) {
            do {
               System.out.println("a보다 큰 값을 입력하세요!");
               System.out.print("b의 값 : ");
               b = stdIn.nextInt();
            }while (b <= a);
        }

        System.out.println("b-a는 " + (b-a) + "입니다.");


    }
}
