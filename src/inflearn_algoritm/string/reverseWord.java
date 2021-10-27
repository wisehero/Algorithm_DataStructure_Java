package inflearn_algoritm.string;

import java.util.Arrays;
import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb = sb.append(sc.next() + "\n");
        }
        sb.reverse();
        String[] arr = new String[n];
        arr = sb.toString().split("\n");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
