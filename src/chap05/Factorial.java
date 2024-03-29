package chap05;

// 팩토리얼을 재귀적으로 구현

import java.util.Scanner;

public class Factorial {
    // 양의 정수 n의 팩토리얼을 반환
    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    // 반복문으로 팩토리얼 만들기임
    static int factorialV2(int n) {
        int fact = 1;

        while(n > 1) {
            fact *= n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorialV2(x) + "입니다.");
    }
}
