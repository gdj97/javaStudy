package test0107;

/*
 * [결과]
결과 1: 100.0
결과 2: 5.0
 */


public class Test04_A {
    public static void main(String[] args) {
        // 메서드 호출 시 직접 람다식을 전달해 봅니다.
        System.out.print("결과 1: ");
        printResult(10.0, n -> n * n); // 제곱해서 출력

        System.out.print("결과 2: ");
        printResult(10.0, n -> n / 2.0); // 절반으로 나눠서 출력
    }
    // 함수형 인터페이스를 매개변수로 받는 메서드
    public static void printResult(double val, DoubleOp op) {
        double res = op.apply(val);
        System.out.println(res);
    }
}