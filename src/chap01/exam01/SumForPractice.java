package chap01.exam01;

// 임의의 숫자를 입력받아 '1+2+3+.....+n = 합계' 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class SumForPractice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();
        int sum = 0;
        String result = "";

        for(int i = 1; i<=n ; i++) {
            sum += i;
            if (i < n) {
                result += i + "+";
            } else {
                result += i;
            }

        }

        System.out.println(result + "=" + sum);

    }
}
