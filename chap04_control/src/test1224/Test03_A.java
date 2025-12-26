package test1224;
/*
 * 화면에서 자연수를 입력받아서 각 자리수의 합을 구하기
 * [결과]
 * 자연수 입력 : 123
 * 자리수합 : 6
 */

import java.util.Scanner;

public class Test03_A {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int tnum = num; //123
		while(tnum > 0) { //0
			sum += tnum % 10; //3 + 2 + 1
			tnum /= 10; //0
		}
		System.out.println(num + "자리수의 합:"+sum);
		System.out.println("========== for 구문으로 =========");
		for(tnum=num,sum=0;tnum>0;tnum/=10) {
			sum += tnum % 10;
		}
		System.out.println(num + "자리수의 합:"+sum);

	}
}
