package inflearn_algoritm.string;

import java.util.Scanner;



public class findString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strArray = str.split("");
        String findChar = sc.nextLine();

        int cnt = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equalsIgnoreCase(findChar)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
