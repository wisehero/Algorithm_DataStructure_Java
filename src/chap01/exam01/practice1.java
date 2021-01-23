package chap01.exam01;


/*
 1. 네 값의 최댓값을 구하는 메서드를 작성하십시오.
 2. 세 값의 최솟값을 구하는 메서드를 작성하십시오.
 3. 네 값의 최솟값을 구하는 메서드를 작성하십시오.
*/

public class practice1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) b = max;
        if(c > max) c = max;
        if(d > max) d = max;

        return  max;
    }

   static int min3(int a, int b, int c) {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }
}
