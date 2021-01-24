package chap01.exam01;

// 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있습니다. 가우스의 덧셈이라는 방법을 이용하여
// 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.

import java.util.Scanner;

public class SumForPractice2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("가우스의 덧셈을 이용하여 1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();
        int m = n; // n이 for문의 반복횟수를 지정해주기 때문에 계산에서 n의 역할을 대신 함.

        int sum = 0;
        if (n%2 == 0) {
            for(int i=1; i<=n/2;i++) {
                sum += i + m;
                m--;
            }
        }
        else {
            for(int i=1; i<=(n+1)/2 ; i++) {
                if(i == (n+1)/2) {
                    sum += i;
                }
                else{
                    sum += i + m;
                    m--;
                    System.out.println(sum);}
            }
        }

        System.out.println("n까지의 합은 " + sum  +" 입니다.");
    }
}
