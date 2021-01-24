package chap01.exam01;

// 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면 '그 수는 3자리입니다.' 라고 출력하고,
// 1314를 입력하면 '그 수는 4자리 입니다.' 라고 출력하면 됩니다.

import java.util.Scanner;

public class SumForPosPractice2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. > ");
        int n = stdIn.nextInt();
        int cnt = 0;// 자릿

        if (n <= 0) {
            do{
                System.out.print("양의 정수를 입력하세요. >");
                n = stdIn.nextInt();
            }while (n < 0);
        }

       while (n>0) {
           n /= 10;
           cnt++;
       }

       System.out.println("그 수는 " + cnt + "자리 입니다.");
    }
}
