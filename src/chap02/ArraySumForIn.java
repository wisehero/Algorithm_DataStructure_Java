package chap02;

// 확장된 for문을 이용한 배열의 합계
// 배열의 인덱스를 다룰 필요가 없을 경우에 사용

public class ArraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);

        double sum = 0;

        for(double i : a)
            sum += i;

        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }
}
