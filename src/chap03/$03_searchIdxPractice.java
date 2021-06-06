package chap03;

import java.util.Scanner;

public class $03_searchIdxPractice {
//    요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고 일치한 요솟수를 반환하는 메서드를 작성
//    예를 들어 요솟수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고 key가 9면 배열 idx에 {1, 3, 7}을 저장하고 3을 반환한다.


    static int searchIdx(int a[], int n, int key, int[] idx) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[count++] = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // 배열 생성
        Scanner input = new Scanner(System.in);
        System.out.print("요소 수 : ");
        int num = input.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = input.nextInt();
        }

        System.out.print("찾는 값 : ");
        int key = input.nextInt();

        int[] resultIdx = new int[num];

        int result = searchIdx(x, num, key, resultIdx);

        System.out.println("일치한 요솟수는 " + result + " 입니다.");


        // 배열 탐색 및 결과 리턴
    }
}
