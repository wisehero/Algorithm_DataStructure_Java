package chap02;

// 1000 이하의 소수를 열거

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0 )
                    break;
            }
            if (n == i)
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}

// 이 프로그램은 n이 2 또는 3으로 나누어 떨어지지않으면 2x2인 4 또는 2 x 3 인 6으로도 나누어떨어지지 않는다.
// 그러므로 이 프로그램은 불필요한 나눗셈을 하고 있다.
// 즉 정수 n이 소수인지의 여부는 아래 조건을 만족하는 지 조사하면 된다.
// 2부터 n-1까지의 어떤 소수로도 나누어 떨어지지 않는다.
