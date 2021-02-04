package chap02.Practice;

// 배열 b의 모든 요소를 배열 a에 복사하는 메서드를 작성

import java.util.Scanner;

public class CopyArrayPractice {
    static void copy(int[] a, int[] b) {
        // 넘겨진 배열 a의 길이가 배열 b의 길이보다 작거나 같을 경우
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 요솟수는 ：");
        int numa = stdIn.nextInt(); // 요솟수
        int[] a = new int[numa]; // 요솟수 numa인 배열
        for (int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("b의 요솟수는 ：");
        int numb = stdIn.nextInt(); // 요솟수
        int[] b = new int[numb]; // 요솟수 numb인 배열
        for (int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }
        copy(a, b); // 배열 b의 모든 요소를 배열 a에 역순으로 복사

        System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
        for (int i = 0; i < numa; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
