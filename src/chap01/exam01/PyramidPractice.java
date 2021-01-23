package chap01.exam01;

import java.util.Scanner;

// n단의 피라미드를 출력하는 메서드를 작성하세요.

public class PyramidPractice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 단을 쌓으실 건가요? >");
        int n = stdIn.nextInt();

        spira(n);
    }

    static void spira(int n) {
        for(int i = 1; i <= n; i++){
            for (int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j = 1; j <= (i-1)*2 + 1; j++)
                System.out.print("*");
            for(int j = 1; j<=n-i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
