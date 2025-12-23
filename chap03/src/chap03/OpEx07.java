package chap03;

import java.util.Scanner;

/*
 * 삼항연산자
 * 조건 연산자 : 조건문으로 변경 가능
 *  (조건문)?참:거짓
 *  
 *  조건문 : 결과가 boolean인 구문
 *  
 *  화면에서 점수를 입력받아 60이상인경우 합격을 출력. 60미만이면 불합격 출력하기
 */
public class OpEx07 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score +"점:" + ((score >= 60)?"합격":"불합격")+"입니다.");
	}
}
