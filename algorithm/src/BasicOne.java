import java.math.BigInteger;
public class BasicOne {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static  void fractions() {

        int a = 1;
        int b = 2;
        double sum = 0;
        for (int i = 1; b <= 50; i++){

            sum += (double) a/b;
            a += i;
            b += i;
        }
        System.out.println(sum);
    }
    static void factorial() {
        BigInteger fac = BigInteger.ONE;

        for (int i = 1; i <= 100; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
            System.out.println(fac);
        }
        System.out.println(fac);
    }
    static void step6() {
        int K = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            K += i;
            sum += K;
        }

        System.out.println(sum);
    }
    static void step5() {
        int K = 1;
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            K += i;
            sum += K;
        }
        System.out.println(sum);
    }
    static void step4() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (i % 2 == 0) ? -i : i;
        }
        System.out.println(sum);
    }

    static void squared() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(Math.pow(i, 2));
            System.out.println(i * i);
        }
    }
    static void oddEven() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
        }
    }

    public static void main(String[] args) {
//        oddEven();
//        squared();
//        step4();
//        step5();
//        step6();
//        factorial();
//        fractions();
        int result = fibonacci(8);
        System.out.println(result);
    }
}
