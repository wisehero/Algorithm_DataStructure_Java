package backjoon.If;

import java.util.Scanner;

public class alarm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute < 45) {
            --hour;
            if (hour < 0) {
                hour = 23;
            }
            minute = 60 +  (minute - 45);
        } else {
            minute = minute - 45;
        }
        System.out.print(hour + " ");
        System.out.print(minute);
    }
}
