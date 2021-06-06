package chap03;

import java.util.Scanner;

public class $03_linearSearchScanningPractice {
    static int seqSearchEx(int[] a, int n, int key) {
        System.out.print("   |");
        for (int k = 0; k < n; k++)
            System.out.printf("%4d", k);
        System.out.println();

        System.out.print("---+");
        for (int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for (int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);
            System.out.println("\n   |");
            if (a[i] == key)
                return i; // 검색성공
        }
        return -1; // 검색실패
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = input.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = input.nextInt();
        }
        System.out.print("찾는 값："); // 키 값을 입력 받음
        int ky = input.nextInt();

        int idx = seqSearchEx(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은 " + "x[" + idx + "]에 있습니다.");
    }


}

