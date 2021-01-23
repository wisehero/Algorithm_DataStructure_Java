package chap01.exam01;

import java.util.Scanner;

public class npiraPractice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 단을 쌓으실 건가요? > ");
        int n = stdIn.nextInt();

        npira(n);
    }

    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=1; j<=(i-1)*2+1; j++)
                System.out.print(i%10); // 출력할 숫자는 나머지로 구하면 된다.
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
