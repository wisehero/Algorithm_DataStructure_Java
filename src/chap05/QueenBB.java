package chap05;

public class QueenBB {
    static boolean[] flag = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
    static int[] pos = new int[8]; // 각 열의 퀸의 위치

    // 각 열의 퀸의 위치를 출력합니다.
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("2%d", pos[i]);
        }
        System.out.println();
    }

    // i 열의 알맞은 위치에 퀸을 배치합니다.
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[i] == false) { // j 행에는 퀸을 배치하지 않았다면
                pos[i] = j;             // 퀸을 j행에 배치합니다.
                if (i == 7)               // 모든 열에 배치한 경우
                    print();
                else {
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
