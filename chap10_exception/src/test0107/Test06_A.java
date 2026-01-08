package test0107;


public class Test06_A {
    public static void main(String[] args) {
        // 1. 실수를 반올림하여 정수로 만드는 람다 (0.5 더해서 형변환)
        DoubleToInt round = d -> (int)(d + 0.5);

        // 2. 실수의 정수 부분만 추출하는 람다
        DoubleToInt truncate = d -> (int)d;

        System.out.println("3.45 반올림: " + round.process(3.45));
        System.out.println("3.7 반올림: " + round.process(3.7));
        System.out.println("3.7 소수점 버림: " + truncate.process(3.7));
    }
}