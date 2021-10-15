package backjoon.iterate;

import java.util.Scanner;

/**
 * 두 정수를 입력 받은 다음, A+B를 출력한다.
 * 단, 처음에 테스트 케이스의 갯수를 입력한다.
 */
public class nCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
