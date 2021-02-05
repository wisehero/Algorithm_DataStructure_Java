package chap02.Practice;

// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.

import java.util.Scanner;

public class ReverseArrayPractice2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 갯수를 입력해주세요. >");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < x.length; i++)
            x[i] = stdIn.nextInt();

        System.out.println("배열의 모든 요소의 합계 : " + sumOf(x));

    }
    static int sumOf(int [] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
