package chap02.Practice;

import java.util.Scanner;

public class ReverseArrayPractice {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < (a.length / 2) + 1; i++ ){
            if (i < 3) {
                for (int j = 0; j < a.length; j++){
                    System.out.print(a[j]);
                }
                System.out.println("\na[" + i + "]과(와) a[" + (a.length - 1 - i) + "]를 교환합니다.");
                swap(a, i, a.length - 1 - i);
            } else {
                for (int j = 0; j < a.length; j++){
                    System.out.print(a[j]);
                }
                System.out.println("\n역순 정렬을 마쳤습니다.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 개수: ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);



    }
}
