package chap01.exam01;

// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
// static int sumof(int a, int b)

public class SumForPractice3 {

    static int sumof(int a, int b) {
        int sum = 0;
        if (a > b) {
            for(int i=b; i<=a; i++) {
                sum += i;
            }
        }else if (a < b) {
            for(int i=a; i<=b; i++) {
                sum += i;
            }
        }else {
            sum = a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("3과 5 사이의 정수의 합 : " + sumof(3,5));
        System.out.println("12와 3사이의 정수의 합 : " + sumof(12,3));
    }
}
