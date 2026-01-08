package test0107;


public class Test02_A {
	public static void main(String[] args) {
        // 1. 섭씨를 화씨로 변환하는 람다 (공식: 섭씨 * 1.8 + 32)
        Converter toFahrenheit = c -> c * 1.8 + 32;

        // 2. 킬로미터를 마일로 변환하는 람다 (공식: km * 0.62)
        Converter toMile = k -> k * 0.62;

        System.out.println("섭씨 30도 -> 화씨: " + toFahrenheit.convert(30));
        System.out.println("10km -> 마일: " + toMile.convert(10));
	}
}

