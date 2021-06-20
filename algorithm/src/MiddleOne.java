import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MiddleOne {

    static void isDivisor1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }

    static void isDivisor2(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= (int)Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (divisors.get(divisors.size() - 1) != n / i) divisors.add(n / i);
            }
        }
        divisors.sort(null);
        for (int i = 0; i < divisors.size(); i++) {
            System.out.println(divisors.get(i));
        }
    }

    public static void main(String[] args) {

        isDivisor1(25);
        isDivisor2(25);








        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
// 무식하게 풀기
//        int i;
//        int j;
//        // todo: 2~100까지 중에 소수들 판별
//        for (i = 2; i <= 100000; i++) {
//            // todo: i가 소수인지 판별
//            for (j = 2; j <= i; j++) {
//                if (i % j == 0) break;
//            }
//            if (i == j) System.out.println(i);
//        }

        // 에라토스테네스의 체
        // todo step_1 -> n까지의 배열 선언 후 모두 소수라고 가정 (true)
//        boolean[] isPrimeList = new boolean[100001];
//        Arrays.fill(isPrimeList, true);
//
//        // todo step_2 -> n까지의 수를 모두 반복하지 않고 제곱근까지만 반복하여 걸러내기
//        for (int i = 2; i < (int)Math.sqrt(100000)+1; i++) {
//            if (isPrimeList[i]) { // todo step_3 -> 소수일 때만 그 수의 배수들을 false로 변경
//                int j = 2;
//                while (i * j <= 100000) {
//                    isPrimeList[i * j] = false;
//                    j++;
//                }
//            }
//        }

        // todo step_4 -> 출력
//        for (int i = 2; i <= 100000; i++) {
//            if (isPrimeList[i]) System.out.println(i);
//        }
//
//        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
