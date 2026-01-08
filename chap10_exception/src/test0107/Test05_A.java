package test0107;

public class Test05_A {
    public static void main(String[] args) {
        // 1. a가 b의 배수인지 확인하는 람다
        IntChecker isMultiple = (a, b) -> a % b == 0;

        // 2. a와 b의 합이 100보다 큰지 확인하는 람다
        IntChecker isLargeSum = (a, b) -> (a + b) > 100;

        System.out.println("10은 4의 배수인가? " + isMultiple.check(10, 4));
        System.out.println("10은 5의 배수인가? " + isMultiple.check(10, 5));
        System.out.println("70과 40의 합은 100 초과인가? " + isLargeSum.check(70, 40));
        System.out.println("60과 40의 합은 100 초과인가? " + isLargeSum.check(60, 40));
    }
}