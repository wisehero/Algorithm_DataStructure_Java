package inflearn_algoritm.string;

import java.util.Scanner;

public class longWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;

        String input = sc.nextLine();
        String[] inputArr = input.split(" ");

        String output = "";
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].length() > length) {
                length = inputArr[i].length();
                output = inputArr[i];
            } else if (inputArr[i].length() == length) {
                continue;
            }
        }
        System.out.println(output);
    }
}
