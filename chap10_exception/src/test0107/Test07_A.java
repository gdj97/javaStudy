package test0107;

/*
 *  문제: start부터 end까지의 숫자 중 짝수만 출력하는 람다를 작성하세요.
 *  실행문이 여러 줄이므로 중괄호 { } 가 필요합니다.
 *  
 *  
 */


public class Test07_A {
    public static void main(String[] args) {
        RangePrinter evenPrinter = (s, e) -> {
            System.out.print(s + "부터 " + e + "까지 짝수: ");
            for (int i = s; i <= e; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        };

        evenPrinter.printRange(1, 10);
    }
}