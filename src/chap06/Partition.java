package chap06;

import java.util.Scanner;

public class Partition {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void partition(int a[], int n) {
        int pl = 0;
        int pr = n - 1;
        int x = a[n / 2]; // 피벗(가운데 위치 값)

        do {
            // 왼쪽부터 스캔 했을 때 피벗보다 작으면
            while (a[pl] < x) pl++;
            // 오른쪽부터 스캔 했을 때 피벗 보다 크면
            while (a[pr] > x) pr--;
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        System.out.println("피벗의 값은 " + x + "입니다.");

        System.out.println("피벗 이하의 그룹");
        for (int i = 0; i <= pl - 1; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("피벗과 일치하는 그룹");
            for (int i = pr + 1; i < pl - 1; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }
        partition(x, nx);
    }
}
