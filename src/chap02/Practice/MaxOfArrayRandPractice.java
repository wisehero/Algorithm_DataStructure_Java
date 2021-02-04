package chap02.Practice;

// 사람 수도 난수로 생성하도록 프로그램을 작성하세요.

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandPractice {
        static int maxOf(int[] a) {
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i]>max)
                    max = a[i];
            }
            return max;
        }

        public static void main(String[] args) {
            Random rand = new Random();
            Scanner stdIn = new Scanner(System.in);

            System.out.println("키의 최댓값을 구합니다.");

            int num = rand.nextInt(10);
            System.out.print("사람 수: " + num );

            int[] height = new int[num];

            System.out.println("\n키 값은 아래와 같습니다.");
            for(int i = 0; i < num; i++){
                height[i] = 100 + rand.nextInt(90); // 0<= n < 90 사이의 난수 생성
                System.out.println("height[" + i + "]:" + height[i]);
            }

            System.out.println("최댓값은 " + maxOf(height) + "입니다.");
        }
}
