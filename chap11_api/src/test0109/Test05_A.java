package test0109;
/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 * [결과]
 * 12,340
 */

public class Test05_A {
	public static void main(String[] args) {
		String str = "1,234";
		//str.replace(",","") : ,를 빈문자열로 변경. , 제거
		int num = Integer.parseInt(str.replace(",","")); //1234
		System.out.println(num);
		System.out.println(String.format("%,d", num*10));
		System.out.printf("%,d\n", num*10);	

	}
}
